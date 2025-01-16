package ru.surikov.entities;

import java.util.ArrayList;
import java.util.List;

public class DataLists {

    public static List<String> stringList = new ArrayList<>();
    public static List<Integer> integerList = new ArrayList<>();
    public static List<Double> doubleList = new ArrayList<>();

    public static List<String> getStringList() {
        return stringList;
    }

    public static void addDataToStringList(String data) {
        stringList.add(data);
    }

    public static List<Integer> getIntegerList() {
        return integerList;
    }

    public static void addDataToIntegerList(int data) {
        integerList.add(data);
    }

    public static List<Double> getDoubleList() {
        return doubleList;
    }

    public static void addDataToDoubleList(double data) {
        doubleList.add(data);
    }
}
