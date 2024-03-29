package _01_text_block;

public class _02_Indentation {

    public static void main(String... args) {
        indentationExample();
        indentationWithTab();
    }

    private static void indentationExample() {
        System.out.println("""
            {
                firstName: "John",
                lastName: "Doe",
            }
        """);
    }

    private static void indentationWithTab() {
        // A tabulation is hidden!
        System.out.println("""
            {
				firstName: "John",
				lastName: "Doe",
            }
        """);
    }
}
