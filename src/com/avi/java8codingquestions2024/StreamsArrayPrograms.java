package com.avi.java8codingquestions2024;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsArrayPrograms {
    public static void main(String[] args) {
        Integer[] array1 = {5, 1, 9,3};
        Integer[] array2 = {3, 8, 2};

        // Concatenate and sort in descending order
        Integer[] result = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .sorted(Comparator.reverseOrder())
                .toArray(Integer[]::new);

        // Print the result
        System.out.println(Arrays.toString(result));

    }






}
