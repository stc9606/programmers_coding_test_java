package org.example.array;

public class 삼각달팽이 {

    private static final int N = 4;
    private static final int[] dx = { 0, 1, -1 };
    private static final int[] dy = { 1, 0, -1 };

    public static void main(String[] args) {
        // 1. 2차원 배열 선언
        int[][] triangle = new int[N][N];
        int v = 1;

        // 2. 숫자를 채운 현재를 (0,0)으로 설정
        int x = 0;
        int y = 0;
        int d = 0;

        while (true) {
            triangle[y][x] = v++;
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (nx == N || ny == N || nx == -1 || ny == -1 || triangle[ny][nx] != 0) {
                d = (d + 1) % 3;
                nx = x + dx[d];
                ny = y + dy[d];
                if (nx == N || ny == N || nx == -1 || ny == -1 || triangle[ny][nx] != 0)
                    break;
            }
            x = nx;
            y = ny;
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
