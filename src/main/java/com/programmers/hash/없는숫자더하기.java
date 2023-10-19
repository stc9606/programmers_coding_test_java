package com.programmers.hash;

import java.util.HashSet;
import java.util.Set;

public class 없는숫자더하기 {

    private static final int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 0 };

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int v : numbers) {
            set.add(v);
        }

        int sum = 0;
        for (int n = 0; n <= 9; n++) {
            if (set.contains(n)) continue;
            sum += n;
        }

        System.out.println(sum);
    }

}
