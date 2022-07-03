package org.example.HackerrankPractice;

import java.util.ArrayList;
import java.util.List;

public class BreakingRecords4 {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int min = scores.get(0);
        int max = scores.get(0);
        int maxCount = 0;
        int minCount = 0;
        for (Integer score : scores) {
            if (score > max) {
                max = score;
                maxCount++;
            } else if (score < min) {
                min = score;
                minCount++;
            }
        }
        List<Integer> res = new ArrayList<>();
        res.add(maxCount);
        res.add(minCount);

        return res;
    }
}
