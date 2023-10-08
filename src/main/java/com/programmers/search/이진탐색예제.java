package com.programmers.search;

import java.util.Arrays;

public class 이진탐색예제 {

    private static int[] arr = new int[100];

    public static void main(String[] args) {
        for (int i = 0; i < 100; i ++) {
            arr[i] = i + 1;
        }

        int result = binarySearch(arr, 50);
        System.out.println(result);
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (end > start) {
            int mid = (start + end) / 2;
            int value = arr[mid];

            if (value == target) {
                return mid;
            } else if (value > target) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }

        return -1;
    }
}
