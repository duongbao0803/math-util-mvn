/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baobatluc.mathutil.core;

/**
 *
 * @author duong
 */
//class này sẽ chứa 1 loạt các hàm static dùng để làm thư viện cho các hàm khác xài
public class MathUtility {

    public static final Double PI = 3.14;

    //Hàm tính n giai thừa
    // 0! = 1! = quy ước
    // Không tính được giai thừa của số âm
    // n! tăng rất nhanh, 20! vừa đủ full kiểu long 
    // 21! không chứa trong long được, tràn kiểu dữ liệu
    // quy ước < 0 ! và 20! NÉM NGOẠI LỆ, KHÔNG TÍNH ĐƯỢC
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid n must be zero to twenty");
//        }
//        if (n == 0 || n == 1) {
//            return 1; //kết thúc sớm nếu có thể
//        }
//        long result = 1; //biến tích lũy, gom dồn việc nhân
//        //acc: accomulation          
//        // sống sót đến for n = 2...20
//        for (int i = 2; i <= n; i++) 
//            result *= i;
//        
//        return result;
//    }
    //5! = 1.2.3.4.  5
    //5! = 4! x 5 = 5 x 4!
    //4! = 1.2.3. 4
    //4! = 3! x 4 = 4 x 3! đuổi nhau
    //3! = 3 x 2!
    //2! = 2 x 1! DỪNG NHEN, ĐỆ QUY LUÔN PHẢI DỪNG
    //N! = N X (N - 1)! ĐỆ QUY LÀ GỌI LÀ CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n must be zero to twenty");
        }
        if (n == 0 || n == 1) {
            return 1; //kết thúc sớm nếu có thể
        }            //DÙNG ĐỆ QUY

        return n * getFactorial(n - 1);

        // KĨ THUẬT KIỂM THỬ GỌI LÀ: REGRESSION TESTING
        //                           KIỂM THỬ HỒI QUY - TESTLAI5 NHỮNG THỨ 
        //                           ĐÃ TỪNG TEST
        //Trong thực tế làm dự án, code của ta sẽ liên tục được chỉnh sửa
        // sửa vì:
        // fix bug thì phải sửa code, sửa hàm
        // thêm hàm, thêm tính nng9
        // tối ưu hàm cũ, làm hàm cũ gọn hơn, dễ đọc hơn, chạy nhanh hơn
        // HÀM ĐANG NGON - MÀU XANH, NẾU TA SỬA HÀM VÌ LÍ DO GÌ ĐÓ
        // LIỆU RẰNG HÀM CÒN XANH HAY KO, THÌ PHẢI TEST LẠI
        // NẾU TEST = TAY, BẰNG LOG, THÌ CỰC KÌ TỐN THỜI GIAN, MẤT SỨC
        // NẾU CODE CỦA CỦA TA CÓ SẴN TEST SCRIPT - CODE KIỂM THỬ
        // TA CHỈ GVIEC65 RUN LẠI CÁI TEST SCRIPT NÀY
        // NẾU HÀ SỬA NGON, NÓ PHẢI RA MÀU XANH
        // NẾU HÀM SỬA KO NGON, BỊ MÀU ĐỎ !!!
        // NHỜ TEST SCRIPT TA VERIFY LẠI 1 HÀM RẤT NHANH -> KIỂM THU367 LẠI
        // THỨ ĐÃ TỪNG KIEM673 THỬ SẼ ĐẢM BẢO NÓ CÒN NGON SO VỚI TRƯỚC
        // KHI SỬA ĐC GỌI LÀ KIỂM THỬ HỒI QUY - REGRESSION TESTING
        // NHỜ CI, HỒI QUY LIÊN TỤC
        //BÀI NÀY  MÌNH THỬ HỒI QUY BẰNG CÁCH SỬA LẠI HÀM THEO THUẬT TOÁN
        // DỆ QUY - RECURSION
    }
}
