package com.programmers.search;

import java.util.Arrays;

public class 징검다리 {

    private static final int distance = 25;
    private static int[] rocks = { 2, 14, 11, 21, 17 };
    private static final int n = 2;

    public static void main(String[] args) {
        rocks = Arrays.copyOf(rocks, rocks.length + 1);
        rocks[rocks.length-1] = distance;
        Arrays.sort(rocks);

        int start = 1;
        int end = distance + 1;

        while (end - start > 1) {
            int d = (start + end) / 2;

            if (isValid(d, rocks, n)) {
                start = d;
            } else {
                end = d;
            }
        }

        System.out.println(start);
    }

    private static boolean isValid(int d, int[] rocks, int n) {
        int removed = 0;
        int last = 0;

        for (int rock : rocks) {
            if (rock - last < d) {
                removed++;
                continue;
            }
            last = rock;
        }

        return removed <= n;
    }
}
