package ru.surikov.controllers;

import ru.surikov.entities.DataLists;
import ru.surikov.entities.Statistics;

import java.util.Comparator;

public class StatisticController {

    public static void setShortStatistic(){
        if(!DataLists.getIntegerList().isEmpty()){
            Statistics.setCountIntegerElements((int)DataLists.getIntegerList().stream().count());
        }
        if(!DataLists.getDoubleList().isEmpty()){
            Statistics.setCountDoubleElements((int)DataLists.getDoubleList().stream().count());
        }
        if(!DataLists.getStringList().isEmpty()){
            Statistics.setCountStringElements((int)DataLists.getStringList().stream().count());
        }
    }

    public static void setFullStatistic(){
        if(!DataLists.getIntegerList().isEmpty()){
            Statistics.setCountIntegerElements((int)DataLists.getIntegerList().stream().count());
            Statistics.setAvgIntegerElements(DataLists.getIntegerList().stream().mapToInt(Integer::intValue).average().getAsDouble());
            Statistics.setMaxIntegerElements(DataLists.getIntegerList().stream().mapToInt(Integer::intValue).max().getAsInt());
            Statistics.setMinIntegerElements(DataLists.getIntegerList().stream().mapToInt(Integer::intValue).min().getAsInt());
        }
        if(!DataLists.getDoubleList().isEmpty()){
            Statistics.setCountDoubleElements((int)DataLists.getDoubleList().stream().count());
            Statistics.setAvgDoubleElements(DataLists.getDoubleList().stream().mapToDouble(Double::doubleValue).average().getAsDouble());
            Statistics.setMaxDoubleElements(DataLists.getDoubleList().stream().mapToDouble(Double::doubleValue).max().getAsDouble());
            Statistics.setMinDoubleElements(DataLists.getDoubleList().stream().mapToDouble(Double::doubleValue).min().getAsDouble());
        }
        if(!DataLists.getStringList().isEmpty()){
            Statistics.setCountStringElements((int)DataLists.getStringList().stream().count());
            Statistics.setMinStringLengthElements(DataLists.getStringList().stream().min(Comparator.comparingInt(String::length)).get().length());
            Statistics.setMaxStringLengthElements(DataLists.getStringList().stream().max(Comparator.comparingInt(String::length)).get().length());
        }
    }

    public static void viewStatistics(boolean shortStatistics, boolean fullStatistics) {
        if(shortStatistics){
            viewShortStatistic();
        }

        if(fullStatistics){
            viewFullStatistic();
        }
    }

    public static void viewShortStatistic() {
        if(!DataLists.getIntegerList().isEmpty()) {
            System.out.println("Count integer elements: " + Statistics.getCountIntegerElements());
        }
        if(!DataLists.getDoubleList().isEmpty()) {
            System.out.println("Count double elements: " + Statistics.getCountDoubleElements());
        }
        if(!DataLists.getStringList().isEmpty()) {
            System.out.println("Count String elements: " + Statistics.getCountStringElements());
        }
    }

    public static void viewFullStatistic() {
        if(!DataLists.getIntegerList().isEmpty()) {
            System.out.println("\n");
            System.out.println("Count integer elements: " + Statistics.getCountIntegerElements());
            System.out.println("Max integer elements: " + Statistics.getMaxIntegerElements());
            System.out.println("Min integer elements: " + Statistics.getMinIntegerElements());
            System.out.println("Avg integer elements: " + Statistics.getAvgIntegerElements());
        }
        if(!DataLists.getDoubleList().isEmpty()) {
            System.out.println("\n");
            System.out.println("Count double elements: " + Statistics.getCountDoubleElements());
            System.out.println("Max double elements: " + Statistics.getMaxDoubleElements());
            System.out.println("Min double elements: " + Statistics.getMinDoubleElements());
            System.out.println("Avg double elements: " + Statistics.getAvgDoubleElements());
        }
        if(!DataLists.getStringList().isEmpty()) {
            System.out.println("\n");
            System.out.println("Count String elements :" + Statistics.getCountStringElements());
            System.out.println("Max lenght string :" + Statistics.getMaxStringLengthElements());
            System.out.println("Min lenght string :" + Statistics.getMinStringLengthElements());
        }
    }

}
