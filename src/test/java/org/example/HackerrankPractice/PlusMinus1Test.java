package org.example.HackerrankPractice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PlusMinus1Test {

    @Test
    void plusMinus() {
        List<Integer> arr = new ArrayList<>(Arrays.asList(-4, 3, -9, 0, 4, 1));
        PlusMinus1.plusMinus(arr);
    }
}