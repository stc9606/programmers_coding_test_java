package com.programmers.hash;

import java.util.HashSet;
import java.util.Set;

public class 중복된문자제거 {

    public static final String my_string = "people";

    public static void main(String[] args) {
        Set<Character> used = new HashSet<>();

        StringBuilder builder = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if (used.contains(c)) continue;

            used.add(c);
            builder.append(c);
        }

        System.out.println(builder);
    }
}
