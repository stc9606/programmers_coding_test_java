package org.example.array;

import java.util.Arrays;

public class 행렬의곱셉 {

    private static final int[][] arr1 = { {1, 2, 3}, {4, 5, 6} };
    private static final int[][] arr2 = { {7, 10}, {8, 11}, { 9, 12 } };

    public static void main(String[] args) {
        int m = arr1.length;
        int n = arr2[0].length;
        int p = arr2.length;

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < p; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(result));
    }
}
