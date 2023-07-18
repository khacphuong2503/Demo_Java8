package Java8.Stream;


import java.util.stream.Collectors;
import java.util.*;

public class StreamFilterExample {
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Filter the elements of the list that start with "A" and create a new list
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("C"))
                .collect(Collectors.toList());

        // Print each element of the new list to the console
        filteredNames.forEach(System.out::println);
    }
}

