package com.avi.java8codingquestions2024;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeatedCharacter(input);
        System.out.println("First non-repeated character: " + result);
    }

    public static char findFirstNonRepeatedCharacter(String str) {
        Map<Character, Long> characterCount = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> characterCount.get(c) == 1)
                .findFirst()
                .orElse('\0'); // Return null character if not found
    }
}
