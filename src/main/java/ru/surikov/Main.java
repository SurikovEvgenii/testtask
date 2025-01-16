package ru.surikov;

import ru.surikov.controllers.ConfigurationSetController;
import ru.surikov.controllers.StatisticController;
import ru.surikov.entities.Configuration;
import ru.surikov.handlers.FileHandler;

public class Main {
    public static void main(String[] args) {

        String[] argss = {"-s", "-c", "-a", "-d", "-p", "_sample-", "-o", "str\\else", "in1.txt", "in2.txt"};
        Configuration configuration = Configuration.getInstance();
        ConfigurationSetController checkController = new ConfigurationSetController();
        FileHandler fileHandler = new FileHandler();
        checkController.setConfig(argss, configuration);
        System.out.println(configuration.toString());
        fileHandler.readFile();
        fileHandler.writeFile(configuration.getSavePath(), configuration.getPrefix(), configuration.getA());
        StatisticController.setShortStatistic();
        StatisticController.setFullStatistic();
        StatisticController.viewStatistics(configuration.getS(), true);
    }
}