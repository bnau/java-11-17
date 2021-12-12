package _05_pm;

// Ignore during demo
public class _01_switch {

    private static void printType(Object variable) {
        switch (variable) {
            case String s -> System.out.println("This String is %s".formatted(s));
            // Guarded expression
            case Integer i && i >= 0 -> System.out.println("This positive Integer is %d".formatted(i));
            case Integer i -> System.out.println("This negative Integer is %d".formatted(i));
            case null -> System.out.println("This is so null");
            default -> System.out.println("This weird variable is " + variable);
        }
    }

    public static void main(String... args) {
        printType("15");
        printType(15);
        printType(-15);
        printType(null);
    }
}
