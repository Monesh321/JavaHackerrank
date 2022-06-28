package org.example.HackerrankPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiniMaxSum_2 {

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
        // Write your code here
        int nInts = arr.size();
        List<Long> longs = new ArrayList<Long>(nInts);
        for (Integer integer : arr) {
            longs.add(integer.longValue());
        }
        long min = 0;
        long max = 0;
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
                min = max;
            }
            if (sum < min) {
                min = sum;
            }
            i++;
        }
        System.out.printf(min + " " + max);
    }

    public static void main(String[] args) {
        //main method
//      List<Long> arr = new ArrayList<Long>(Arrays. asList(1L, 3L, 5L, 7L, 9L));
        List<Integer> arr = new ArrayList<Integer>(Arrays. asList(1,3,5,7,9));

        MiniMaxSum_2.miniMaxSum(arr);
    }


}
