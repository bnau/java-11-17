package _01_text_block;

public class _03_Formatting {

    public static void main(String... args) {
        formatting();
    }

    private static void formatting() {
        System.out.println("""
                {
                    firstName: "%s",
                    lastName: "%s",
                }""".formatted("John", "Doe"));
    }
}
