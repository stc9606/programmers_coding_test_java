package com.programmers.string;

public class 숫자문자열과영단어 {

    private static final String[] word = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    private static String s = "zero4seveneight";

    public static void main(String[] args) {
        for (int i = 0; i < word.length; i++) {
            s = s.replace(word[i], Integer.toString(i));
        }

        System.out.println(s);
    }
}
