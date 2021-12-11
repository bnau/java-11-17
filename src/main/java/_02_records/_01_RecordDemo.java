package _02_records;

record User(String firstName, String lastName) {}

public class _01_RecordDemo {
    public static void main(String... args) {
        User johnDoe = new User("John", "Doe");

        // Accessor
        System.out.println("User is called %s".formatted(johnDoe.firstName()));

        // Auto-generated equals
        System.out.println(new User("John", "Doe").equals(johnDoe));

        // Auto-generated toString
        System.out.println(johnDoe);
    }
}
