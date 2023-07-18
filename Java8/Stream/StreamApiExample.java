package Java8.Stream;

import java.util.stream.Stream;
import java.util.*;
import java.util.stream.Collectors;

public class StreamApiExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Step 1: Create a stream of the numbers list
        Stream<Integer> numberStream = numbers.stream();

        // Step 2: Filter out the even numbers from the stream
        Stream<Integer> evenNumberStream = numberStream.filter(n -> n % 2 == 0);

        // Step 3: Collect the even numbers into a new list
        List<Integer> evenNumbers = evenNumberStream.collect(Collectors.toList());

        // Step 4: Print the even numbers to the console
        System.out.println("Even numbers: " + evenNumbers);

        // Step 5: Find the sum of all the numbers in the list
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        // Step 6: Print the sum to the console
        System.out.println("Sum of all numbers: " + sum);

        // Step 7: Find the maximum value in the list
        Optional<Integer> max = numbers.stream().max(Integer::compare);

        // Step 8: Print the maximum value to the console
        if (max.isPresent()) {
            System.out.println("Maximum value: " + max.get());
        }
    }
}