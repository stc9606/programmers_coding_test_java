package org.example.level2;

public class 삼각달팽이 {

    private static int N = 4;

    public static void main(String[] args) {
        // 1. 2차원 배열 선언
        int[][] triangle = new int[N][N];
        int v = 1;

        // 2. 숫자를 채운 현재를 (0,0)으로 설정
        int x = 0;
        int y = 0;

        while (true) {
            // (1) 아래로 이동
            while (true) {
                triangle[y][x] = v++;
                if (y + 1 == N || triangle[y + 1][x] != 0)
                    break;
                y += 1;
            }

            if (x + 1 == N || triangle[y][x + 1] != 0)
                break;
            x += 1;

            // (2) 오른쪽으로 이동
            while (true) {
                triangle[y][x] = v++;
                if (x + 1 == N || triangle[y][x + 1] != 0)
                    break;
                x += 1;
            }

            if (triangle[y -1][x - 1] != 0)
                break;
            x -= 1;
            y -= 1;

            // (3) 왼쪽 위로 이동
            while (true) {
                triangle[y][x] = v++;
                if (triangle[y - 1][x - 1] != 0)
                    break;
                x -= 1;
                y -= 1;
            }

            if (y + 1 == N || triangle[y + 1][x] != 0)
                break;
            y += 1;
        }

        int[] result = new int[v - 1];
        int index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                result[index++] = triangle[i][j];
            }
        }

        for (int val : result)
            System.out.println(val);
    }
}
