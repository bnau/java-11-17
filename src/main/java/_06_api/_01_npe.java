package _06_api;

public class _01_npe {
    public static void main(String... args) {
        Root root = new Root(null);
        System.out.println(root.nullable().value().getBytes().clone());
        // Run this with and without the debug options
        // Nullable nullable = root.nullable();
        // System.out.println(nullable.value().getBytes().clone());
    }
}

record Root(Nullable nullable) {
}

record Nullable(String value) {
}
