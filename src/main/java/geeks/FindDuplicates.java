package main.java.geeks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        System.out.println("Original List: " + numbers);
        List<Integer> duplicates = findDuplicates(numbers);
        System.out.println("Duplicate Elements: " + duplicates);
    }

    private static List<Integer> findDuplicates(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        return numbers.stream()
                .filter(n -> !uniqueNumbers.add(n)) // Returns false if the element is already present
                .collect(Collectors.toList());
    }
}

