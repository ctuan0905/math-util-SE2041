package com.tuandeptrai.shop.core;

public class MathUtil {
    public static long getFactorial(int n) {

        //thuật toán tính n! = 1 * 2 * 3 *---* n! từ 0...20
        if(n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid parameter, n must be between 0 and 20");
        }

        if(n == 0) {
            return 1;  //n = 0 return ngay
        }

        //sure n từ 1..20
        long result = 1;  //khởi đầu giai thừa bằng 1, nhân dần
                            //code cố tình tạo bug giai thừa được nhân thêm 10
        //sửa lại source từ 10 thành 1 để ngon trở lại, green 4 ever
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
