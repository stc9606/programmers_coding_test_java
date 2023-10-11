package com.programmers.search;

public class 입국심사 {

    private static final int n = 6;
    private static final int[] times = { 7, 10 };

    public static void main(String[] args) {
        long start = 1;
        long end = 1000000000000000000L;

        while (end > start) {
            long t = (start + end) / 2;

            if (isValid(t, n, times)) {
                end = t;
            } else {
                start = t + 1;
            }
        }

        System.out.println(start);
    }

    private static boolean isValid(long t, int n, int[] times) {
        long c = 0;
        for (int time : times) {
            c += t / time;
        }

        return c >= n;
    }
}
