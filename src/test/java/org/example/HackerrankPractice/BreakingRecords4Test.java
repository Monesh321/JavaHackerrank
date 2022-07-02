package org.example.HackerrankPractice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BreakingRecords4Test {

    @Test
    void breakingRecords() {
        List<Integer> scores = new ArrayList<>(Arrays.asList(12, 24, 10, 24));
        List<Integer> results = BreakingRecords4.breakingRecords(scores);
        System.out.println(results);
    }
}