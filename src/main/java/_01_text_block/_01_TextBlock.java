package _01_text_block;

public class _01_TextBlock {

    public static void main(String... args) {
        oldStyleMultilineText();
        simpleTextBlock();

        escapingWhitespaces();
        escapingCharacters();
    }

    private static void oldStyleMultilineText() {
        System.out.println("{\n" +
                           "    firstName: \"John\",\n" +
                           "    lastName: \"Doe\",\n" +
                           "}");
    }

    private static void simpleTextBlock() {
        System.out.println("""
                {
                    firstName: "John",
                    lastName: "Doe",
                }
            """);
    }

    // Doesn't compile
    private static void firstLineShouldBeEmpty() {
//        System.out.println("""{
//                    firstName: "John",
//                    lastName: "Doe",
//                }
//                """);
    }

    private static void escapingWhitespaces() {
        // Prints Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus.
        // Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor.
        System.out.println("""
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. \
                Sed non risus. \s
                Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor.
                """);
    }

    private static void escapingCharacters() {
        System.out.println("""
                "No need to escape one double quote"
                \"""We need to escape each group of three\"""
                """);
    }

    private static void formatting() {
        System.out.println("""
                {
                    firstName: "%s",
                    lastName: "%s",
                }""".formatted("John", "Doe"));
    }
}
