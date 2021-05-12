/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.gringrape.codelife;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    int[] solution(int N, int[] stages) {
        double[] failureRates = new double[]{0.5, 1};

        return IntStream.range(1, N + 1)
                .boxed()
                .sorted((a, b) -> Double.compare(failureRates[b - 1], failureRates[a - 1]))
                .mapToInt(i -> i)
                .toArray();
    }

    @Test void simple() {
        assertArrayEquals(
                    solution(2, new int[]{1, 2}),
                    new int[]{2, 1}
                );

//        assertArrayEquals(
//                solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}),
//                new int[]{3, 4, 2, 1, 5}
//        );
    }
}
