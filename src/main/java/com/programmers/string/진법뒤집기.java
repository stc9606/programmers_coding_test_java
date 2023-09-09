package com.programmers.string;

public class 진법뒤집기 {

    private static final int n = 125;

    public static void main(String[] args) {
        String str = Integer.toString(n, 3);
        String reversed = new StringBuilder(str).reverse().toString();

        Integer result = Integer.valueOf(reversed, 3);
        System.out.println(result);
    }

}
