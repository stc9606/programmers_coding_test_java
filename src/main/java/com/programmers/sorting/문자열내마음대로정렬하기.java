package com.programmers.sorting;

import java.util.Arrays;

public class 문자열내마음대로정렬하기 {

    private static final String[] strings = { "sun", "bed", "car" };
    private static final int n = 1;

    public static void main(String[] args) {
        String[] sorting = sorting();
        System.out.println(Arrays.toString(sorting));
    }

    private static String[] sorting() {
        Arrays.sort(strings, (s1, s2) -> {
            if (s1.charAt(n) != s2.charAt(n)) {
                return s1.charAt(n) - s2.charAt(n);
            }
            return s1.compareTo(s2);
        });
        return strings;
    }


}
