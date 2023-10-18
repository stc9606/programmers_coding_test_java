package com.programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class A로B만들기 {

    private static final String before = "olleh";
    private static final String after = "hello";

    public static void main(String[] args) {
        int result = toMap(before).equals(toMap(after)) ? 1 : 0;
        System.out.println(result);
    }

    private static Map<Character, Integer> toMap(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
        }

        return map;
    }

}
