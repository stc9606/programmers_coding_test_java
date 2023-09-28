package com.programmers.sorting;

import java.util.Arrays;

public class K번째수 {

    private static final int[] array =  { 1, 5, 2, 6, 3, 7, 4 };
    private static final int[][] commands = { {2, 5, 3}, {4, 4, 1}, {1, 7, 3} };

    public static void main(String[] args) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < answer.length; i++) {
            int[] command = commands[i];
            int from = command[0] - 1;
            int to = command[1];
            int k = command[2] - 1;

            int[] sub = Arrays.copyOfRange(array, from, to);
            Arrays.sort(sub);
            answer[i] = sub[k];
        }

        System.out.println(Arrays.toString(answer));
    }
}
