package com.programmers.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 이진변환반복하기 {

    private static String s = "110010101001";

    public static void main(String[] args) {
        int loop = 0;
        int removed = 0;

        while (!"1".equals(s)) {
            int zero = countZero(s);
            loop++;
            removed += zero;

            int one = s.length() - zero;
            s = Integer.toString(one, 2);
        }

        int[] result = {loop, removed};
        System.out.println(Arrays.toString(result));
    }

    private static int countZero(String s) {
        int zero = 0;
        for (char c : s.toCharArray())
            if ('0' == c)
                zero++;

        return zero;
    }

}
