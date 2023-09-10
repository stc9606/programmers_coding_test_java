package com.programmers.string;

public class 문자열P와Y의개수 {

    private static String s = "Pyy";

    public static void main(String[] args) {
        s = s.toLowerCase();

        int pCount = s.length() - s.replace("p", "").length();
        int yCount = s.length() - s.replace("y", "").length();

        boolean result = false;
        if (pCount == yCount)
            result = true;

        System.out.println(result);
    }
}
