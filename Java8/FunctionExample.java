package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // Define a Function that doubles an integer.
        Function<Integer, Integer> doubleFunction = i -> i * 2;

        List<Integer> doubledNumbers = numbers.stream()
                .map(doubleFunction)
                .collect(Collectors.toList());

        System.out.println("Doubled numbers: " + doubledNumbers);
    }
}
