package com.programmers.exhaustiveSearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class 소수찾기 {

    private static final String number = "17";

    public static void main(String[] args) {
        Set<Integer> primes = new HashSet<>();
        int[] numbers = number.chars().map(c -> c + '0').toArray();

        getPrimes(0, numbers, new boolean[numbers.length], primes);
        System.out.println(primes.size());

    }

    private static Set<Integer> getPrimes(int acc, int[] numbers, boolean[] isUsed, Set<Integer> primes) {
        if (isPrime(acc)) primes.add(acc);

        for (int i = 0; i < numbers.length; i++) {
            if (isUsed[i]) continue;

            int nextAcc = acc * 10 + numbers[i];

            isUsed[i] = true;
            getPrimes(nextAcc, numbers, isUsed, primes);
            isUsed[i] = false;
        }

        return primes;
    }

    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
