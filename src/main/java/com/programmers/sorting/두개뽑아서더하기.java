package com.programmers.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 두개뽑아서더하기 {

    private static final int[] numbers = { 2, 1, 3, 4, 1 };

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] result = set.stream().mapToInt(Integer::intValue).sorted().toArray();
        System.out.println(Arrays.toString(result));
    }
}
