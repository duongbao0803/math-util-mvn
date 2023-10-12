/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.baobatluc.mathutil.main;

import com.baobatluc.mathutil.core.MathUtility;

/**
 *
 * @author duong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TEST CASE #1 - XEM CHI TIẾT BÊN DƯỚI
        int n = 0; //given n = 0, ý muốn tính 0!
        long expected = 1; // ý muốn là hàm n! = 0! phải trả về 1
        long actual = MathUtility.getFactorial(n); // ý nói là hàm chạy ra mấy

        System.out.println(n + "! -> expected: " + expected
                + " | actual = " + actual);

        //TEST CASE #2 - N = 1 -> XEM CHI TIẾT Ở DƯỚI
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! -> expected: " + expected
                + " | actual = " + actual);

        //TEST CASE #3 - N = 5 -> XEM CHI TIẾT Ở DƯỚI
        System.out.println("5! -> expected: 120"
                + " | actual = " + MathUtility.getFactorial(5));

    }
}

//TEST CASE #3: Verify getFactorial(with n = 5)
//STEPS/PROCEDURES:
//              1. Give n = 5
//              2. Call/invoke getFactorial(n = 5)
//EXPECTED RESULT;
//              The method must return 120 in case of 5!
//STATUS: PASSED | FAILED
//TEST CASE #2: Verify getFactorial(with n = 1)
//STEPS/PROCEDURES:
//              1. Give n = 1
//              2. Call/invoke getFactorial(n = 1)
//EXPECTED RESULT;
//              The method must return 1 in case of 1!
//STATUS: PASSED | FAILED
// Mình là dev, mình phải test code của mình ngon trước đã
// Muốn test code là dev hay test app là QC/Tester THÌ CẦN PHẢI CHUẨN BỊ
// TEST CASE - TÌNH HUỐNG KIỂM THỬ, TRƯỜNG HỢP KIỂM THỬ - CÁCH TA 
//             KIỂM THỬ TRONG 1 NGỮ CẢNH NÀO ĐÓ- BÀN VỀ BỘ DATA
//1 TEST CASE CÓ CẤU TRÚC NHƯ SAU:
//ID | Description | Step | Procedure | Expected Result | Status (Passed/Failed)
// DEV EM MUỐN KIỂM THỬ COI HÀM CHÍNH EM VIẾT getFactorial ĐÚNG HAY SAI THÌ EM PHẢI 
// THIẾT KẾ CÁC TEST CASE:
//Test case #1: Verify getFactorial(with n = 0)
//Steps-Procedure:              Các bước để run app
//      1. Given n = 0
//      2. Execute/Call/Invoke function getFactorial(0)
// Expected Result: the function must return 1 (standing for 0! = 1)
// Status: PASSED, or FAILED, ai biết, chồ run app/web đã
//RUN HÀM, RUN APP, ĐƯA TEST DATA VÀO, ĐƯỢC GỌI LÀ TEST RUN

