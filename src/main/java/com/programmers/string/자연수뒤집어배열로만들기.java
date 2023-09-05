package com.programmers.string;

import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {

    private static final long n = 12345;

    public static void main(String[] args) {
        String str = String.valueOf(n);
        String reverseStr = new StringBuilder(str).reverse().toString();
        char[] chars = reverseStr.toCharArray();

        int[] result = new int[chars.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = chars[i] - '0';
        }

        System.out.println(Arrays.toString(result));
    }

}
