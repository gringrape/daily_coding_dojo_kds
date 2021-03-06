/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.gringrape.stockprice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test void testIsWorking() {
        assertThat(1 + 1).isEqualTo(2);
    }

    int[] solution(int[] prices) {
        return IntStream.range(0, prices.length)
                .map(i ->
                        {
                            var count = (int) Arrays.stream(prices, i + 1, prices.length)
                                    .takeWhile(price -> price >= prices[i])
                                    .count();
                            return count == prices.length - i - 1 ? count : count + 1;
                        })
                .toArray();
    }

    @Test void example() {
        assertThat(solution(new int[]{1, 2, 3, 2, 3})).isEqualTo(
                new int[]{4, 3, 1, 1, 0}
        );
    }
}
