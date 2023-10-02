package com.programmers.sorting;

import java.util.Arrays;

public class HIndex {

    private static final int[] citations = { 3, 0, 6, 1, 5 };

    public static void main(String[] args) {
        int solution = solution(citations);
        System.out.println(solution);
    }

    private static int solution(int[] citations) {
        Arrays.sort(citations);
        for (int h = citations.length; h >= 1; h--) {
            if (isValid(citations, h))
                return h;
        }

        return 0;
    }

    private static boolean isValid(int[] citations, int h) {
        int index = citations.length - h;
        return citations[index] >= h;
    }

}
