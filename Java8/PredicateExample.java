package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Define a Predicate that checks if an integer is even.
        Predicate<Integer> evenPredicate = i -> i % 2 == 0;

        List<Integer> evenNumbers = numbers.stream()
                .filter(evenPredicate)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);
    }
}
