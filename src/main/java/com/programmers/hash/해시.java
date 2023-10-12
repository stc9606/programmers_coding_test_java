package com.programmers.hash;

import java.util.HashSet;

public class 해시 {

    private static class Coord {
        public final int x;
        public final int y;

        private Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    public static void main(String[] args) {
        HashSet<Coord> coordSet = new HashSet();

        Coord coord1 = new Coord(1, 2);
        coordSet.add(coord1);
        Coord coord2 = new Coord(1, 2);

        System.out.println(coordSet.contains(coord2));
    }

}
