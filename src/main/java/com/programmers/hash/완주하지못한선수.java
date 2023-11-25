package com.programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {

    private static final String[] participants = {"leo", "kiki", "eden"};
    private static final String[] completions = {"eden", "kiki"};

    public static void main(String[] args) {
        String result = findIncompletePlayer(participants, completions);
        System.out.println(result);
    }

    private static String findIncompletePlayer(String[] participants, String[] completions) {
        Map<String, Integer> completionMap = new HashMap<>();

        for (String c : completions) {
            completionMap.put(c, completionMap.getOrDefault(c, 0) + 1);
        }

        for (String p : participants) {
            if (!completionMap.containsKey(p) || completionMap.get(p) == 0) {
                return p;
            }

            completionMap.put(p, completionMap.get(p) - 1);
        }

        return null;
    }
}
