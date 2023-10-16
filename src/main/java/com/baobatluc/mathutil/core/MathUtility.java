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
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n must be zero to twenty");
        }
        if (n == 0 || n == 1) {
            return 1; //kết thúc sớm nếu có thể
        }
        long result = 10; //biến tích lũy, gom dồn việc nhân
        //acc: accomulation          
        // sống sót đến for n = 2...20
        for (int i = 2; i <= n; i++) 
            result *= i;
        
        return result;
    }
}
