package Java8.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDistinctExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5);

        // Use the distinct() method to remove duplicates from the list
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());

        // Print the original list and the list with duplicates removed to the console
        System.out.println("Danh sách ban đầu: " + numbers);
        System.out.println("Danh sách sau khi loại bỏ giá trị trùng lặp: " + distinctNumbers);
    }
}