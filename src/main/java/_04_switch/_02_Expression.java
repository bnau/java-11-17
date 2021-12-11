package _04_switch;

public class _02_Expression {
    private static void wishGoodHolidaysAndPrintTemperature(String holidaysDestination) {
        // Turn the yield into return and see
        String wishMessage = switch (holidaysDestination) {
            case "beach" -> "Happy swimming";
            case "mountain", "forest" -> "Happy trekking";
            case "home" -> "Happy sleeping";
            default -> {
                System.out.println("I don’t where you'll go");
                yield "Enjoy anyway!";
            }
        };
        System.out.println(wishMessage);

        // Delete the default close and see
        // Return a String and see the variable type
        var temperature = switch (holidaysDestination) {
            case "beach" -> 35;
            case "mountain", "forest" -> 15;
            case "home" -> 20;
            default -> {
                System.out.println("It all depends on you");
                yield null;
            }
        };
        System.out.println(temperature);
    }

    public static void main(String... main) {

        String holidaysDestination = "desert";

        wishGoodHolidaysAndPrintTemperature(holidaysDestination);
    }
}
