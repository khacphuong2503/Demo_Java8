package Java8.Stream;

import java.util.*;
public class StreamForEachExample {
    public static void main(String [] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Iterate over each element in the list and print it to the console using a lambda expression
        names.forEach(name -> System.out.println(name));
        // Alternatively, use a method reference to print each element to the console
        names.forEach(System.out::println);
    }
}