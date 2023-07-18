package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Define a Consumer that prints a greeting message to the console for each string.
        Consumer<String> printName = name -> System.out.println("Hello, " + name);

        names.forEach(printName);
    }
}