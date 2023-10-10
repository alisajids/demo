package com.example.demo;

import java.util.*;
import java.util.stream.*;

public class StreamExamples {
    public static void main(String[] args) {
        // Sample data
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 8, 9);

        // filter
        List<Integer> filteredList = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Filtered List: " + filteredList);

        // map
        List<String> stringList = numbers.stream()
                .map(n -> "Number " + n)
                .collect(Collectors.toList());
        System.out.println("Mapped List: " + stringList);

        // flatMap
        List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
        List<Integer> flatList = nestedList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println("Flat List: " + flatList);

        // distinct
        List<Integer> distinctList = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct List: " + distinctList);

        // sorted
        List<Integer> sortedList = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted List: " + sortedList);

        // forEach
        numbers.stream()
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // collect
        Map<Boolean, List<Integer>> evenOddMap = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Even numbers: " + evenOddMap.get(true));
        System.out.println("Odd numbers: " + evenOddMap.get(false));

        // reduce
        Optional<Integer> sum = numbers.stream()
                .reduce((a, b) -> a + b);
        System.out.println("Sum: " + sum.orElse(0));

        // min, max
        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);
        System.out.println("Min: " + min.orElse(0));
        System.out.println("Max: " + max.orElse(0));

        // count
        long count = numbers.stream()
                .count();
        System.out.println("Count: " + count);

        // anyMatch, allMatch, noneMatch
        boolean anyEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);
        boolean allEven = numbers.stream()
                .allMatch(n -> n % 2 == 0);
        boolean noneGreaterThanTen = numbers.stream()
                .noneMatch(n -> n > 10);
        System.out.println("Any even: " + anyEven);
        System.out.println("All even: " + allEven);
        System.out.println("None greater than 10: " + noneGreaterThanTen);

        // findFirst, findAny
        Optional<Integer> first = numbers.stream()
                .findFirst();
        Optional<Integer> any = numbers.stream()
                .findAny();
        System.out.println("First: " + first.orElse(0));
        System.out.println("Any: " + any.orElse(0));

        // limit, skip
        List<Integer> limitedList = numbers.stream()
                .limit(5)
                .collect(Collectors.toList());
        List<Integer> skippedList = numbers.stream()
                .skip(5)
                .collect(Collectors.toList());
        System.out.println("Limited List: " + limitedList);
        System.out.println("Skipped List: " + skippedList);

        // peek
        List<Integer> peekedList = numbers.stream()
                .peek(n -> System.out.print(n + " "))
                .collect(Collectors.toList());
        System.out.println();
    }
}
