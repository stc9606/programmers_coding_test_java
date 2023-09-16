package com.programmers.exhaustiveSearch;

import java.util.Arrays;

public class 카펫 {

    private static final int BROWN = 10;
    private static final int YELLOW = 2;

    public static void main(String[] args) {
        int[] square = square();
        System.out.println(Arrays.toString(square));
    }

    private static int[] square() {
        for (int width = 3; width <= 5000; width++) {
            for (int height = 3; height <= width; height++) {
                int boundary = (width + height -2) * 2;
                int center = width * height - boundary;

                if (BROWN == boundary && YELLOW == center) {
                    return new int[] {width, height};
                }
            }
        }

        return null;
    }
}
