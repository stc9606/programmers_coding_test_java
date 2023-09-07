package com.programmers.string;

public class 시저암호 {

    private static final String s = "z";
    private static final int n = 1;

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for (char c : s.toCharArray()) {
            builder.append(push(c, n));
        }

        System.out.println(builder);
    }

    private static char push(char c, int n) {
        if (!Character.isAlphabetic(c)) return c;

        int offset = Character.isUpperCase(c) ? 'A' : 'a';
        int position = c - offset;
        position = (position + n) % ('Z' - 'A' + 1);

        return (char) (offset + position);
    }

}
