package ru.surikov.entities;

public class Statistics {

    private static int countIntegerElements;
    private static int countDoubleElements;
    private static int countStringElements;
    private static int minIntegerElements;
    private static int maxIntegerElements;
    private static int minStringLengthElements;
    private static int maxStringLengthElements;
    private static double maxDoubleElements;
    private static double minDoubleElements;
    private static double avgIntegerElements;
    private static double avgDoubleElements;

    public static int getCountIntegerElements() {
        return countIntegerElements;
    }

    public static void setCountIntegerElements(int countIntegerElements) {
        Statistics.countIntegerElements = countIntegerElements;
    }

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

    public static int getMinIntegerElements() {
        return minIntegerElements;
    }

    public static void setMinIntegerElements(int minIntegerElements) {
        Statistics.minIntegerElements = minIntegerElements;
    }

    public static int getMaxIntegerElements() {
        return maxIntegerElements;
    }

    public static void setMaxIntegerElements(int maxIntegerElements) {
        Statistics.maxIntegerElements = maxIntegerElements;
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

    public static double getAvgIntegerElements() {
        return avgIntegerElements;
    }

    public static void setAvgIntegerElements(double avgIntegerElements) {
        Statistics.avgIntegerElements = avgIntegerElements;
    }

    public static double getAvgDoubleElements() {
        return avgDoubleElements;
    }

    public static void setAvgDoubleElements(double avgDoubleElements) {
        Statistics.avgDoubleElements = avgDoubleElements;
    }
}
