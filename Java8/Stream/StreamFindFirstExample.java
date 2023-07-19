package Java8.Stream;

import java.util.Arrays;
import java.util.Optional;

public class StreamFindFirstExample {
    public static void main(String[] args) {
        // Create a stream of integers
        Integer[] numbers = {};
        Optional<Integer> first = Arrays.stream(numbers).findFirst();

        // Print the first element of the stream
        if (first.isPresent()) {
            System.out.println("The first element is: " + first.get());
        } else {
            System.out.println("The stream is empty");
        }
    }
}