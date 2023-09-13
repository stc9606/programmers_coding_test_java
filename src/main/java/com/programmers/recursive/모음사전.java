package com.programmers.recursive;

import java.util.ArrayList;
import java.util.List;

public class 모음사전 {

    private static final char[] CHARS = "AEIOU".toCharArray();
    private static final String WORD = "AAAE";

    public static void main(String[] args) {
        List<String> generate = generate("AAA");
        int i = generate("AAA").indexOf(WORD);

        System.out.println(i);
    }

    private static List<String> generate(final String word) {
        List<String> words = new ArrayList<>();
        words.add(word);

        if (word.length() == 5)
            return words;

        for (char c : CHARS) {
            words.addAll(generate(word + c));
        }

        return words;
    }
}
