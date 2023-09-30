package com.programmers.sorting;

public class 문자열내림차순으로배치하기 {

    private static final String s = "Zbcdefg";

    public static void main(String[] args) {
        String result = s.chars()
                .boxed()
                .sorted((s1, s2) -> s2 - s1)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(result);
    }
}
