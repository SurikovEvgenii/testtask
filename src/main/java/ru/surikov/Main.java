package ru.surikov;

import java.util.Arrays;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        String[] argss = {"-s", "-a", "-d", "-p", "sample-", "-o", "str\\else", "in1.txt", "in2.txt"};

        ConfigurationCheck check = new ConfigurationCheck();
        check.checkConfig(argss);
    }
}