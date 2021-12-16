package _07_native_api;

import jdk.incubator.foreign.*;

import static jdk.incubator.foreign.ResourceScope.newImplicitScope;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

public class _01_foreign_function {
    public static void main(String[] args) throws Throwable {
        String path = _01_foreign_function.class.getResource("/say_hello.so").getPath();
        System.load(path);

        MethodHandle methodReference = CLinker.getInstance()
                .downcallHandle(
                        SymbolLookup.loaderLookup().lookup("sayHello").get(),
                        MethodType.methodType(MemoryAddress.class, MemoryAddress.class),
                        FunctionDescriptor.of(CLinker.C_POINTER, CLinker.C_POINTER)
                );

        MemorySegment nativeString = CLinker.toCString("Joe", newImplicitScope());

        MemoryAddress nativeResult = (MemoryAddress) methodReference.invoke(nativeString.address());

        System.out.println(CLinker.toJavaString(nativeResult));
    }
}
