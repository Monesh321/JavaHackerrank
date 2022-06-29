package org.example.HackerrankPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum2 {
    /**
     * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
     * Example
     * arr=[1,3,5,7,9]
     * The minimum sum is 1+3+5+7=16 and the maximum sum is 3+5+7+9=24
     * The function prints
     * 16 24
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void miniMaxSum(List<Integer> arr) {
        // My partially correct solution(12 out of 15 test cases passed)
        int nInts = arr.size();
        List<Long> longs = new ArrayList<>(nInts);
        for (Integer integer : arr) {
            longs.add(integer.longValue());
        }
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        int i = 0;
        while (i < 5) {
            long sum = 0;
            for (int j = 0; j < longs.size(); j++) {
                if (j != i) {
                    sum = sum + longs.get(j);
                }
            }
            if (sum > max) {
                max = sum;
            }
            if (sum < min) {
                min = sum;
            }
            i++;
        }
        System.out.printf(min + " " + max);
    }

    public static void miniMaxSum_alternateMethod(List<Integer> arr) {
        // Write your code here(internet solution complete)
        Collections.sort(arr);
        long sum = 0;
        for (int num : arr)
            sum += num;
        System.out.print((sum - arr.get(4)) + " " + (sum - arr.get(0)));
    }
}
