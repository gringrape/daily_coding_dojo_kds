/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.gringrape.codelife;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    double failureOf(int n, int[] stages) {
        long countTheSame = Arrays.stream(stages).filter(i -> i == n).count();
        long countSameOrLarger = Arrays.stream(stages).filter(i -> i >= n).count();

        return (double) countTheSame / countSameOrLarger;
    }

    int[] solution(int N, int[] stages) {
        return Stream.iterate(1, i -> i + 1)
                .limit(N)
                .sorted(Comparator.comparingDouble(a -> 1 - failureOf(a, stages)))
                .mapToInt(i -> i)
                .toArray();
    }

    @Test void existenceOfFunction() {
        assertThat(solution(1, new int[]{1})).isNotNull();
    }

    @Test void simple() {
//        assertThat(solution(2, new int[]{1, 2}))
//                .isEqualTo(new int[]{2, 1});
        assertThat(solution(3, new int[]{1, 1, 3}))
                .isEqualTo(new int[]{3,1, 2});
    }
}
