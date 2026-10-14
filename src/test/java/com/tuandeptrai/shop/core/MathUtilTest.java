package com.tuandeptrai.shop.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilTest {
    //testcase 1: n = 5!, expected = 120
    @Test
    void testFactorialGivenValidN5RunWellsReturnsWell120() {
        int n = 5;
        long expected = 120;
        long actual = MathUtil.getFactorial(n);

        //so sánh bằng cơm hay bằng framework
        //bằng cơm, in log file, đã chơi và nay không chơi, xem bên main()

        //so sánh bằng tool xanh đỏ
        assertEquals(expected, actual);
    }

    //testcase 1: n = 6!, expected = 720
    @Test
    void testFactorialGivenValidN6RunWellsReturnsWell720() {
        int n = 6;
        long expected = 720;
        long actual = MathUtil.getFactorial(n);

        //so sánh bằng cơm hay bằng framework
        //bằng cơm, in log file, đã chơi và nay không chơi, xem bên main()

        //so sánh bằng tool xanh đỏ
        assertEquals(expected, actual);
    }

    //testcase 3: n = 0!, expected = 1
    @Test
    void testFactorialGivenValidN0RunWellsReturnsWell1() {
        int n = 0;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);

        //so sánh bằng cơm hay bằng framework
        //bằng cơm, in log file, đã chơi và nay không chơi, xem bên main()

        //so sánh bằng tool xanh đỏ
        assertEquals(expected, actual);
    }

    //testcase 1: n = -1!, expected = hàm phải ném ra ngoại lệ thì mới là hàm đúng
    // vì dự kiến -1 phải ném ra ngoại lệ!!!
    // thấy ngoại lệ là thấy màu xanh
    //đặc biệt: ngoại lệ là thứ k thể so sánh (assertEquals()) ta phải dùng 1 assertEquals khác
    @Test
    void testFactorialGivenValidNMinus1ThrowsException() {
        int inValidN = -1;

//        assertThrows(ngoại lệ câfn bắt xem có xh không, hàm lambda có lệnh gọi hàm code chính mà gây ra lỗi);
        //assertThrows(IllegalArgumentException.class,  () -> {});
        // {} dùng từ 2 hàm trở lên và phải có dấu ;, nếu chỉ 1 hàm thì không cần cũng được

//        assertThrows(IllegalArgumentException.class,  () -> MathUtil.getFactorial(inValidN));
        assertThrows(IllegalArgumentException.class,
                () -> {
                        MathUtil.getFactorial(inValidN);
                      }
                    );
    }
}