package Java8;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Create an Optional containing a non-null value
        Optional<String> optional1 = Optional.of("Hello");

        // Create an Optional containing a null value
        Optional<String> optional2 = Optional.ofNullable(null);

        // Check if optional1 contains a value, and print it if it does
        if (optional1.isPresent()) {
            String value = optional1.get();
            System.out.println("optional1 contains: " + value);
        } else {
            System.out.println("optional1 is empty");
        }

        // Check if optional2 contains a value, and print it if it does
        if (optional2.isPresent()) {
            String value = optional2.get();
            System.out.println("optional2 contains: " + value);
        } else {
            System.out.println("optional2 is empty");
        }

        // Use the orElse() method to provide a default value if optional2 is empty
        String value2 = optional2.orElse("World");
        System.out.println("value2 is: " + value2);

        // Use the map() method to apply a function to the value in optional1
        Optional<String> optional3 = optional1.map(s -> s + " World");
        System.out.println("optional3 contains: " + optional3.get());
    }
}