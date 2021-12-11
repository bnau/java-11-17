package _02_records;

import java.io.Serializable;

// Records can implement interfaces
record Address(int number, String street, City city) implements Serializable {

    private static final int DEFAULT_NUMBER = 1;

    // Different constructor
    public Address(String street, City city) {
        this(DEFAULT_NUMBER, street, city);
    }

    // Override toString
    public String toString() {
        return """
                %d, %s
                %d, %s""".formatted(number, street, city.zipCode(), city.name());
    }
}

record City(int zipCode, String name) {
}

public class _02_CustomizedRecord {
    public static void main(String... args) {
        User johnDoe = new User("John", "Doe");
        Address address = new Address("rue Dumont D'Urville", new City(75016, "Paris"));

        System.out.println("""
                %s lives at %s""".formatted(johnDoe, address));
    }
}
