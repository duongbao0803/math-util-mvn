/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.baobatluc.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author duong
 */
public class MathUtilityTest {

    //TEST CASE TEMPLATE/STRUCTURE
    //ID | DESC | STEPS/PROCEDURES | EXPECTED VALUE | STATUS (PASSED/FAILED)
    
    
    
    //Test case #1: Verify the getFactorial() function with n = 0
    //Steps/Procedures:
    //      1. Given n = 0
    //      2. Call/invoke getFactorial(int n)
    //Expected Result
    //      The method getFactorial(n = 0) must return 1
    //                  as the result of 0! == 1
    // Status: PASSED | FAILED DOÁN XEM KHI CHẠY APP/HÀM/METHOD
    // dính dáng đến FRAMEWORK
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(0));
    }

    //Test case #2........
    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(1));
    }

    //Test case #3........
    @Test
    public void verifyFactorialGivenRightArgument5ReturnsOk() {
        assertEquals(120, MathUtility.getFactorial(5));
    }
}

//3 TEST CASE TRÊN KO ĐẸP, BỐC MJUI2, BAD SMELLS VÌ CHỈ KHÁC NHAU PHẦN DATA
// TRONG NGHỀ KIỂM THỬ CÓ 2 KĨ THUẬT ĐÓ LÀ TÁCH HÀM DATA KIỂM THỬ RA
// 1 CHỖ, CHO DỄ NHÌN, DỄ QUẢN LÍ ĐƯỢC DATA THIẾU ĐÓ HAY KO

//SAU ĐÓ TA ĐƯ BỘ DATA NÀY VÀO TRONG CÂU LỆNH SO SÁNH ASSERT()
//QUA CÁC THAM SỐ (PARAMETER)
// TỨC LÀ ASSERTEQUALS (EXPECTED, ACTUAL) LÀ 2 THAM SỐ
// ỨNG VỚI BỘ DATA ĐƯỢC TÁCH RA
//                  120     5!
//                  720     61
//                  24      4!
//                  6       3!
//                  2       2!
//                  ..



//              MẢNG [4][2] {0, 1} {1, 1} {2, 2} {3, 6} {5, 120} 
//CODE NHÌN GÔN, PHÁT HIỆN ĐƯỢC THIỆU ĐỦ TEST DATA, TEST CASE
//KĨ THUẬT TÁCH DATA KIỂM THỬ RA KHỎI CÂU LNEH65 SO SÁNH -> ĐƯỢC GỌI LÀ
// DDT - DATA DRIVEN TESTING - KIỂM THỬ THEO HƯỚNG TÁCH DATA RIÊNG LẺ
