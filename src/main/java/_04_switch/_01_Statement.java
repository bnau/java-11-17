package _04_switch;

// Ignore during demo
public class _01_Statement {

    private static void wishGoodHolidays(String holidaysDestination) {
        // The good old way
        switch (holidaysDestination) {
            case "beach":
                System.out.println("Happy swimming");
                break;
            case "mountain":
            case "forest":
                System.out.println("Happy trekking");
                break;
            case "home":
                System.out.println("Happy sleeping");
                break;
            default:
                System.out.println("I don’t where you'll go");
                System.out.println("Enjoy anyway!");
        }

        // The arrow way
        switch (holidaysDestination) {
            case "beach" -> System.out.println("Happy swimming");
            case "mountain", "forest" -> System.out.println("Happy trekking");
            case "home" -> System.out.println("Happy sleeping");
            default -> {
                System.out.println("I don’t where you'll go");
                System.out.println("Enjoy anyway!");
            }
        }
    }

    public static void main(String... main) {

        String holidaysDestination = "mountain";

        wishGoodHolidays(holidaysDestination);
    }
}
