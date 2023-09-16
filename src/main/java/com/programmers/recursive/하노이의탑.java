package com.programmers.recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 하노이의탑 {

    private static final int N = 15;

    public static void main(String[] args) {
        List<int[]> process = new ArrayList<>();
        hanoi(N, 1, 3, process);
        System.out.println(Arrays.deepToString(process.toArray(new int[0][])));
    }

    private static void hanoi(int n, int from, int to, List<int[]> process) {
        // 종료 조건, 점화식 구현
        if (n == 1) {
            process.add(new int[] { from, to });
            return;
        }

        int empty = 6 - from - to; // 기둥이 1,2,3 이고 to를 제외한 빈 기둥을 찾기 위한 empty를 구하는 식
        hanoi(n-1, from, empty, process);
        hanoi(1, from, to, process);
        hanoi(n-1, empty, to, process);
    }

}
