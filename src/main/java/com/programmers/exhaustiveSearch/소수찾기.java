package com.programmers.exhaustiveSearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class 소수찾기 {

    private static final String number = "17";

    public static void main(String[] args) {
        List<Integer> numbers = number.chars()
                .map(c -> c - '0')
                .boxed()
                .collect(Collectors.toList());

        int size = getPrimes(0, numbers).size();
        System.out.println(size);

    }

    private static Set<Integer> getPrimes(int acc, List<Integer> numbers) {
        Set<Integer> primes = new HashSet<>();
        if (isPrime(acc)) primes.add(acc);

        for (int i = 0; i < numbers.size(); i++) {
            int nextAcc = acc * 10 + numbers.get(i);
            List<Integer> nextNumbers = new ArrayList<>(numbers);
            nextNumbers.remove(i);
            primes.addAll(getPrimes(nextAcc, nextNumbers));
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
