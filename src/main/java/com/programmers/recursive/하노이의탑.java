package com.programmers.recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 하노이의탑 {

    private static final int N = 2;

    public static void main(String[] args) {
        int[][] result = hanoi(N, 1, 3).toArray(new int[0][]);
        System.out.println(Arrays.deepToString(result));
    }

    private static List<int[]> hanoi(int n, int from, int to) {
        // 종료 조건, 점화식 구현
        if (n == 1)
            return List.of(new int[] { from, to });
        int empty = 6 - from - to; // 기둥이 1,2,3 이고 to를 제외한 빈 기둥을 찾기 위한 empty를 구하는 식

        List<int[]> result = new ArrayList<>();
        result.addAll(hanoi(n-1, from, empty));
        result.addAll(hanoi(n, from, to));
        result.addAll(hanoi(n-1, empty, to));
        return result;
    }

}
