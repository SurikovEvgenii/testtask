package ru.surikov.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckTypeOfDataControllerTest {

    CheckTypeOfDataController checkTypeOfDataController = new CheckTypeOfDataController();

    @Test
    void isDoubleTest(){
        assertEquals(true, checkTypeOfDataController.isDouble("2.043"));
        assertEquals(true, checkTypeOfDataController.isDouble("2.044E-10"));
        assertEquals(true, checkTypeOfDataController.isDouble("-2.045"));
        assertEquals(true, checkTypeOfDataController.isDouble("-2.046E-10"));
        assertEquals(true, checkTypeOfDataController.isDouble("0.0"));
        assertEquals(false, checkTypeOfDataController.isDouble("2043"));
        assertEquals(false, checkTypeOfDataController.isDouble("123TestString"));
    }

    @Test
    void isIntegerTest(){
        assertEquals(true, checkTypeOfDataController.isLong("2"));
        assertEquals(true, checkTypeOfDataController.isLong("-2"));
        assertEquals(true, checkTypeOfDataController.isLong("0"));
        assertEquals(false, checkTypeOfDataController.isLong("1.00"));
        assertEquals(false, checkTypeOfDataController.isLong("0.00"));
        assertEquals(false, checkTypeOfDataController.isLong("-1.000E-10"));
        assertEquals(false, checkTypeOfDataController.isLong("String"));
        assertEquals(false, checkTypeOfDataController.isLong("String123"));
    }

    @Test
    void isStringTest(){
        assertEquals(true, checkTypeOfDataController.isString("TestString"));
        assertEquals(false, checkTypeOfDataController.isString("123"));
        assertEquals(false, checkTypeOfDataController.isString("123.123"));
        assertEquals(false, checkTypeOfDataController.isString("123.123123E-10"));
        assertEquals(false, checkTypeOfDataController.isString("-123"));
        assertEquals(false, checkTypeOfDataController.isString("-123.123"));
        assertEquals(false, checkTypeOfDataController.isString("-123.123123E-10"));
    }


}
