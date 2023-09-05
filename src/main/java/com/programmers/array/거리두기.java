package com.programmers.array;

public class 거리두기 {

    private static final String[][] places = {{"P000P", "0XX0X", "0PXPX", "00X0X", "P0XXP"}, {"P00PX", "0XPXP", "PXXX0", "0XXX0", "000PP"},
            {"PX0PX", "0X0XP", "0XP0X", "0XX0P", "PXP0X"}, {"000XX", "X000X", "000XX", "0X00X", "00000"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};

    private static final int dx[] = {0, -1, 1, 0};
    private static final int dy[] = {-1, 0, 0, 1};

    public static void main(String[] args) {
        int[] answer = new int[places.length];
        for (int i = 0; i < answer.length; i++) {
            String[] place = places[i];
            char[][] room = new char[places.length][];
            for (int j = 0; j < room.length; j++) {
                room[j] = place[j].toCharArray();
            }

            if (isDistanced(room)) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }

        for (int s : answer)
            System.out.println(s);
    }

    private static boolean isNextToVolunteer(char[][] room, int x, int y, int exclude) {
        for (int d = 0; d < 4; d++) {
            if (d == exclude) continue;

            int nx = x + dx[d];
            int ny = y + dy[d];
            if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length)
                continue;

            if (room[ny][nx] == 'P')
                return true;
        }

        return false;
    }

    private static boolean isDistanced(char[][] room, int x, int y) {
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length)
                continue;

            switch (room[ny][nx]) {
                case 'P': return false;
                case '0':
                    if (isNextToVolunteer(room, nx, ny, 3 - d))
                        return false;
                    break;
            }
        }

        return true;
    }

    private static boolean isDistanced(char[][] room) {
        for (int y = 0; y < room.length; y++) {
            for (int x = 0; x < room[y].length; x++) {
                if (room[y][x] != 'P')
                    continue;
                if (!isDistanced(room, x, y))
                    return false;
            }
        }

        return true;
    }

}
