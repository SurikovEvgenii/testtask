package ru.surikov.entities;

public class Statistics {

    private static int countLongElements;
    private static int countDoubleElements;
    private static int countStringElements;
    private static long minLongElements;
    private static long maxLongElements;
    private static int minStringLengthElements;
    private static int maxStringLengthElements;
    private static double maxDoubleElements;
    private static double minDoubleElements;
    private static double avgLongElements;
    private static double avgDoubleElements;


    public static int getCountDoubleElements() {
        return countDoubleElements;
    }

    public static void setCountDoubleElements(int countDoubleElements) {
        Statistics.countDoubleElements = countDoubleElements;
    }

    public static int getCountStringElements() {
        return countStringElements;
    }

    public static void setCountStringElements(int countStringElements) {
        Statistics.countStringElements = countStringElements;
    }

    public static int getMinStringLengthElements() {
        return minStringLengthElements;
    }

    public static void setMinStringLengthElements(int minStringLengthElements) {
        Statistics.minStringLengthElements = minStringLengthElements;
    }

    public static int getMaxStringLengthElements() {
        return maxStringLengthElements;
    }

    public static void setMaxStringLengthElements(int maxStringLengthElements) {
        Statistics.maxStringLengthElements = maxStringLengthElements;
    }

    public static double getMaxDoubleElements() {
        return maxDoubleElements;
    }

    public static void setMaxDoubleElements(double maxDoubleElements) {
        Statistics.maxDoubleElements = maxDoubleElements;
    }

    public static double getMinDoubleElements() {
        return minDoubleElements;
    }

    public static void setMinDoubleElements(double minDoubleElements) {
        Statistics.minDoubleElements = minDoubleElements;
    }

    public static double getAvgLongElements() {
        return avgLongElements;
    }

    public static void setAvgLongElements(double avgLongElements) {
        Statistics.avgLongElements = avgLongElements;
    }

    public static double getAvgDoubleElements() {
        return avgDoubleElements;
    }

    public static void setAvgDoubleElements(double avgDoubleElements) {
        Statistics.avgDoubleElements = avgDoubleElements;
    }

    public static long getMaxLongElements() {
        return maxLongElements;
    }

    public static void setMaxLongElements(long maxLongElements) {
        Statistics.maxLongElements = maxLongElements;
    }

    public static long getMinLongElements() {
        return minLongElements;
    }

    public static void setMinLongElements(long minLongElements) {
        Statistics.minLongElements = minLongElements;
    }

    public static int getCountLongElements() {
        return countLongElements;
    }

    public static void setCountLongElements(int countLongElements) {
        Statistics.countLongElements = countLongElements;
    }
}
