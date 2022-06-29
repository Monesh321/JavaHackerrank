package org.example.HackerrankPractice;

import org.junit.jupiter.api.Test;

class TimeConversion3Test {

    @Test
    void timeConversion() {
        System.out.println("Testing Time Conversion...");
        String time = TimeConversion3.timeConversion("12:05:59AM");
        System.out.println(time);
    }
}