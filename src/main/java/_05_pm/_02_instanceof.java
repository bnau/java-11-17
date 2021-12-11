package _05_pm;

public class _02_instanceof {

    private static void printType(Object variable) {
        if (variable instanceof String s) {
            System.out.println("This String is %s".formatted(s));
        } else if (variable instanceof Integer i) {
            if (i >= 0) {
                System.out.println("This positive Integer is %d".formatted(i));
            } else {
                System.out.println("This negative Integer is %d".formatted(i));
            }
        }
    }

    public static void main(String... args) {
        printType("15");
        printType(15);
        printType(-15);
        printType(null);
    }
}
