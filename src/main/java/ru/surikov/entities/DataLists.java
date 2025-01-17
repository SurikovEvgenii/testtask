package ru.surikov.entities;

import java.util.ArrayList;
import java.util.List;

public class DataLists {

    public static List<String> stringList = new ArrayList<>();
    public static List<Long> longList = new ArrayList<>();
    public static List<Double> doubleList = new ArrayList<>();

    public static List<String> getStringList() {
        return stringList;
    }

    public static void addDataToStringList(String data) {
        stringList.add(data);
    }

    public static List<Long> getLongList() {
        return longList;
    }

    public static void addDataToLongList(long data) {
        longList.add(data);
    }

    public static List<Double> getDoubleList() {
        return doubleList;
    }

    public static void addDataToDoubleList(double data) {
        doubleList.add(data);
    }
}
