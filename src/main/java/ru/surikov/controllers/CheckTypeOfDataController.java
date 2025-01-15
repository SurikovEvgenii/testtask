package ru.surikov.controllers;

public class CheckTypeOfDataController {

    public static boolean isDouble(String str) {
        if(str.matches("^[-+]?\\d*\\.\\d+(?:[eE][-+]?\\d+)?$")){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isInteger(String str) {
        if(str.matches("^-?\\d+$")){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isString(String str) {
        if(str.matches("[a-zA-Zа-яА-ЯёЁ\\s]+")){
            return true;
        } else {
            return false;
        }
    }

}
