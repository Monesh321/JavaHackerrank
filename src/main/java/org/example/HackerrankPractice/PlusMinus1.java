package org.example.HackerrankPractice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PlusMinus1 {
    /**
     * Complete the 'plusMinus' function below.
     * <p>
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        Map<String, Integer> mp = new HashMap<>();
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (Integer integer : arr) {
            if (integer > 0) {
                pos = pos + 1;
                mp.put("positive", pos);
            } else if (integer < 0) {
                neg = neg + 1;
                mp.put("negative", neg);
            } else {
                zero = zero + 1;
                mp.put("zero", zero);
            }
        }
        double size = arr.size();
        if (mp.get("positive") != null) {
            double arg = (mp.get("positive")) / size;
            System.out.printf("%.6f%n", arg);
        } else {
            double arg = (0) / size;
            System.out.printf("%.6f%n", arg);
        }
        if (mp.get("negative") != null) {
            double arg2 = (mp.get("negative")) / size;
            System.out.printf("%.6f%n", arg2);
        } else {
            double arg2 = (0) / size;
            System.out.printf("%.6f%n", arg2);
        }
        if (mp.get("zero") != null) {
            double arg3 = (mp.get("zero")) / size;
            System.out.printf("%.6f%n", arg3);
        } else {
            double arg3 = (0) / size;
            System.out.printf("%.6f%n", arg3);
        }
    }
}
