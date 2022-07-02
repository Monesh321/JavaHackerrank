package org.example.HackerrankPractice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MiniMaxsum2Test {

    @Test
    void miniMaxSum() {
        List<Integer> arr = new ArrayList<>(Arrays.asList(942381765, 627450398, 954173620, 583762094, 236817490));
        MiniMaxSum2.miniMaxSum(arr);
    }

    @Test
    void miniMaxSum_alternateMethod() {
        List<Integer> arr = new ArrayList<>(Arrays.asList(942381765, 627450398, 954173620, 583762094, 236817490));
        MiniMaxSum2.miniMaxSum_alternateMethod(arr);
    }
}