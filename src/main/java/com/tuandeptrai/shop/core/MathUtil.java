package com.tuandeptrai.shop.core;

public class MathUtil {
    public static long getFactorial(int n) {

        //REFACTORING, REFACTOR: TỐI ƯU, TINH CHỈNH SOURCE CODE
        // CODE MỚI KHI ĐƯỢC ĐƯA LÊN SERVER PHẢI ĐƯỢC CHECK LẠI NGAY Ở NHÁNH DEV, HOẶC KHI ĐƯA VÀO
        //NHÁNH MAIN THÌ CŨNH PHẢI ĐƯỢC CHECK ĐỂ ĐẢM BẢO RẰNG NÓ KHÔNG MÀU XANH, PASSED CÁC TEST CASE
        // LÝ DO: HÀM THÌ PHẢI CHẠY ĐÚNG!!!!!!!!!!!
        // NẾU PROJECT CÓ SẴN TDD, UNIT TEST, THÌ QUÁ TRÌNH KIỂM THỬ LẠI CODE VỪA SỬA ĐIỂM RA RẤT NHANH, RẤT TIỆN
        //DO UNIT TEST KHI PHỐI HỢP VỚI CI SCRIPT (.YAML) SẼ TỰ ĐỘNG ĐUỌC RUN VÀ TỰ BÁO MÀU XANH ĐỎ VÀ GỬI MAIL CHỬI  NẾU CÓ ĐỎ

        // TEST LẠI THỬ ĐÃ TỪNG TEST ĐỂ CHẮC CHẮN RÀNG NÓ VẪN CÒN ỔN SUA KHI ĐƯỢC SỬA GỌI LÀ KIỂM THỬ HÔI QUY - REGRESSION TESTING
        // TA CHỈNH CODE DÙNG ĐỆ QUY - RECURSION
        if(n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid parameter, n must be between 0 and 20");
        }

        if(n == 0) {
            return 1;  //n = 0 hay 1 return ngay, điểm dừng các đệ quy!!!!!!!!
        }

        //đệ quy nè, recursin+on nè, gọi lại chính mình ở quy mô nhỏ hơn nè
        return n * getFactorial(n - 1);
//        n! = n * (n -1);

//        //thuật toán tính n! = 1 * 2 * 3 *---* n! từ 0...20
//        if(n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid parameter, n must be between 0 and 20");
//        }
//
//        if(n == 0) {
//            return 1;  //n = 0 return ngay
//        }
//
//        //sure n từ 1..20
//        long result = 1;  //khởi đầu giai thừa bằng 1, nhân dần
//                            //code cố tình tạo bug giai thừa được nhân thêm 10
//        //sửa lại source từ 10 thành 1 để ngon trở lại, green 4 ever
//        for(int i = 1; i <= n; i++){
//            result *= i;
//        }
//        return result;



    }
}
