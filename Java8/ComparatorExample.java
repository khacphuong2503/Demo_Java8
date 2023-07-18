package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        // Define a Comparator that compares two strings based on their length using the compareTo method.
        Comparator<String> lengthComparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        List<String> sortedNames = names.stream()
                .sorted(lengthComparator)
                .collect(Collectors.toList());

        System.out.println("Sorted names: " + sortedNames);
    }
}