package com.programmers.exhaustiveSearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 불량사용자 {

    private static final String[] USER_ID = new String[] { "frodo", "fradi", "crodo", "abc123", "frodoc" };
    private static final String[] BANNED_ID = new String[] { "fr*d*", "abc1**" };

    public static void main(String[] args) {
        String[][] bans = Arrays.stream(BANNED_ID)
                .map(id -> id.replace("*", "."))
                .map(id -> Arrays.stream(USER_ID)
                        .filter(uId -> uId.matches(id))
                        .toArray(String[]::new))
                .toArray(String[][]::new);

        Set<Set<String>> banSet = new HashSet<>();
        count(0, new HashSet<>(), bans, banSet);

        System.out.println(banSet.size());
    }

    private static void count(int index, Set<String> banned, String[][] bans, Set<Set<String>> banSet) {
        if (index == bans.length) {
            banSet.add(new HashSet<>(banned));
            return;
        }

        for (String id : bans[index]) {
            if (banned.contains(id))
                continue;

            banned.add(id);
            count(index + 1, banned, bans, banSet);
            banned.remove(id);
        }
    }
}
