package com.programmers.recursive;

import java.util.ArrayList;
import java.util.List;

public class 모음사전 {

    private static final char[] CHARS = "AEIOU".toCharArray();
    private static final String WORD = "AAAE";

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        generate("AAA", words);

        System.out.println(words.indexOf(WORD));
    }

    private static void generate(final String word, final List<String> words) {
        words.add(word);

        if (word.length() == 5)
            return;

        for (char c : CHARS) {
            generate(word + c, words);
        }
    }
}
