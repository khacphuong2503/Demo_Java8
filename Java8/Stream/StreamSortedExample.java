package Java8.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamSortedExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");

        // Use the sorted() method to sort the list in alphabetical order
        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());

        // Print the original list and the sorted list to the console
        System.out.println("Original list: " + names);
        System.out.println("Sorted list: " + sortedNames);


        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Original list: " + numbers);
        System.out.println("Sorted list: " + sortedNumbers);
    }
}