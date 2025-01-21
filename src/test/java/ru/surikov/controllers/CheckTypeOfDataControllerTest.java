package ru.surikov.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckTypeOfDataControllerTest {

    @Test
    void isDoubleTest(){
        assertTrue(CheckTypeOfDataController.isDouble("2.043"));
        assertTrue(CheckTypeOfDataController.isDouble("2.044E-10"));
        assertTrue(CheckTypeOfDataController.isDouble("-2.045"));
        assertTrue(CheckTypeOfDataController.isDouble("-2.046E-10"));
        assertTrue(CheckTypeOfDataController.isDouble("0.0"));
        assertFalse(CheckTypeOfDataController.isDouble("2043"));
        assertFalse(CheckTypeOfDataController.isDouble("123TestString"));
    }

    @Test
    void isIntegerTest(){
        assertTrue(CheckTypeOfDataController.isLong("2"));
        assertTrue(CheckTypeOfDataController.isLong("-2"));
        assertTrue(CheckTypeOfDataController.isLong("0"));
        assertFalse(CheckTypeOfDataController.isLong("1.00"));
        assertFalse(CheckTypeOfDataController.isLong("0.00"));
        assertFalse(CheckTypeOfDataController.isLong("-1.000E-10"));
        assertFalse(CheckTypeOfDataController.isLong("String"));
        assertFalse(CheckTypeOfDataController.isLong("String123"));
    }

    @Test
    void isStringTest(){
        assertTrue(CheckTypeOfDataController.isString("TestString"));
        assertFalse(CheckTypeOfDataController.isString("123"));
        assertFalse(CheckTypeOfDataController.isString("123.123"));
        assertFalse(CheckTypeOfDataController.isString("123.123123E-10"));
        assertFalse(CheckTypeOfDataController.isString("-123"));
        assertFalse(CheckTypeOfDataController.isString("-123.123"));
        assertFalse(CheckTypeOfDataController.isString("-123.123123E-10"));
    }


}
