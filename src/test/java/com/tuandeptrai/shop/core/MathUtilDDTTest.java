package com.tuandeptrai.shop.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.Parameter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilDDTTest {

    //hàm trả về mảng 2 chiều; bắt buộc phải static
    public static Object[][] initTestData() {

        Object[][] testData = {{0, 1},
                               {1, 1},
                               {2, 2},
                               {5, 120},
                               {6, 720},
                               };

        return testData;
    }

    @ParameterizedTest
    @MethodSource("initTestData") // 2 thằng này đã thay cho @Test
    void testFactorialGivenValidRunsWell(int n, long expected) throws Exception {
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}