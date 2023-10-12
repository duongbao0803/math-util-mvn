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
