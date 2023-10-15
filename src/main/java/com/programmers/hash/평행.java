package com.programmers.hash;

import java.util.HashSet;
import java.util.Set;

public class 평행 {

    private static final int[][] dots = {
            {1, 4},
            {9, 2},
            {3, 8},
            {11, 6}
    };

    public static void main(String[] args) {
        Set<Double> slopes = new HashSet<>();

        int result = 0;

        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                double slope = getSlope(dots[i][0], dots[i][1], dots[j][0], dots[j][1]);

                if (slopes.contains(slope)) {
                    result = 1;
                }
                slopes.add(slope);
            }
        }

        System.out.println(result);
    }

    public static double getSlope(int x1, int y1, int x2, int y2) {
        return (double) (y2 - y1) / (x2 - x1);
    }
}
