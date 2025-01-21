package ru.surikov.controllers;

import ru.surikov.entities.DataLists;
import ru.surikov.entities.Statistics;

import java.util.Comparator;

public class StatisticsController {

    public static void viewStatistics(boolean shortStatistics, boolean fullStatistics) {
        if (shortStatistics) {
            viewShortStatistics();
        }

        if (fullStatistics) {
            viewFullStatistics();
        }
    }

    public static void setStatistics(boolean shortStatistics, boolean fullStatistics) {
        if (shortStatistics) {
            setShortStatistics();
        }

        if (fullStatistics) {
            setFullStatistics();
        }
    }

    public static void setShortStatistics() {
        if (!DataLists.getLongList().isEmpty()) {
            Statistics.setCountLongElements(DataLists.getLongList().size());
        }
        if (!DataLists.getDoubleList().isEmpty()) {
            Statistics.setCountDoubleElements(DataLists.getDoubleList().size());
        }
        if (!DataLists.getStringList().isEmpty()) {
            Statistics.setCountStringElements(DataLists.getStringList().size());
        }
    }

    public static void setFullStatistics() {
        if (!DataLists.getLongList().isEmpty()) {
            Statistics.setCountLongElements(DataLists.getLongList().size());
            Statistics.setAvgLongElements(DataLists.getLongList().stream().mapToLong(Long::longValue).average().orElseThrow());
            Statistics.setMaxLongElements(DataLists.getLongList().stream().mapToLong(Long::longValue).max().orElseThrow());
            Statistics.setMinLongElements(DataLists.getLongList().stream().mapToLong(Long::longValue).min().orElseThrow());
        }
        if (!DataLists.getDoubleList().isEmpty()) {
            Statistics.setCountDoubleElements(DataLists.getDoubleList().size());
            Statistics.setAvgDoubleElements(DataLists.getDoubleList().stream().mapToDouble(Double::doubleValue).average().orElseThrow());
            Statistics.setMaxDoubleElements(DataLists.getDoubleList().stream().mapToDouble(Double::doubleValue).max().orElseThrow());
            Statistics.setMinDoubleElements(DataLists.getDoubleList().stream().mapToDouble(Double::doubleValue).min().orElseThrow());
        }
        if (!DataLists.getStringList().isEmpty()) {
            Statistics.setCountStringElements(DataLists.getStringList().size());
            Statistics.setMinStringLengthElements(DataLists.getStringList().stream().min(Comparator.comparingInt(String::length)).get().length());
            Statistics.setMaxStringLengthElements(DataLists.getStringList().stream().max(Comparator.comparingInt(String::length)).get().length());
        }
    }

    public static void viewShortStatistics() {
        if(!DataLists.getLongList().isEmpty() || !DataLists.getDoubleList().isEmpty() || !DataLists.getStringList().isEmpty()) {
            System.out.println("Short Statistic\n");
            if (!DataLists.getLongList().isEmpty()) {
                System.out.println("Count integer elements: " + Statistics.getCountLongElements());
            }
            if (!DataLists.getDoubleList().isEmpty()) {
                System.out.println("Count double elements: " + Statistics.getCountDoubleElements());
            }
            if (!DataLists.getStringList().isEmpty()) {
                System.out.println("Count String elements: " + Statistics.getCountStringElements());
            }
        } else {
            System.out.println("Empty Lists!");
        }

    }

    public static void viewFullStatistics() {
        if(!DataLists.getLongList().isEmpty() || !DataLists.getDoubleList().isEmpty() || !DataLists.getStringList().isEmpty()) {
            System.out.println("Full Statistics:\n");
            if (!DataLists.getLongList().isEmpty()) {
                System.out.println("Count integer elements: " + Statistics.getCountLongElements());
                System.out.println("Max integer elements: " + Statistics.getMaxLongElements());
                System.out.println("Min integer elements: " + Statistics.getMinLongElements());
                System.out.println("Avg integer elements: " + Statistics.getAvgLongElements());
            }
            if (!DataLists.getDoubleList().isEmpty()) {
                System.out.println("\nCount double elements: " + Statistics.getCountDoubleElements());
                System.out.println("Max double elements: " + Statistics.getMaxDoubleElements());
                System.out.println("Min double elements: " + Statistics.getMinDoubleElements());
                System.out.println("Avg double elements: " + Statistics.getAvgDoubleElements());
            }
            if (!DataLists.getStringList().isEmpty()) {
                System.out.println("\nCount String elements :" + Statistics.getCountStringElements());
                System.out.println("Max lenght string :" + Statistics.getMaxStringLengthElements());
                System.out.println("Min lenght string :" + Statistics.getMinStringLengthElements());
            }
        } else {
            System.out.println("Empty Lists!");
        }

    }
}
