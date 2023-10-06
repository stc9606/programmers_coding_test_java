package com.programmers.sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 가장큰수 {

    private static int[] numbers = {6, 10, 2};

    public static void main(String[] args) {
        String result = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> {
                    int original = Integer.parseInt(s1 + s2);
                    int reversed = Integer.parseInt(s2 + s1);
                    return reversed - original;
                })
                .collect(Collectors.joining(""))
                .replaceAll("^0+", "0");

        System.out.println(result);
    }
}
