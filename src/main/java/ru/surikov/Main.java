package ru.surikov;

import ru.surikov.controllers.ConfigurationSetController;
import ru.surikov.controllers.StatisticsController;
import ru.surikov.entities.Configuration;
import ru.surikov.handlers.FileHandler;

public class Main {
    public static void main(String[] args) {
        String[] argss = {"-f", "-c", "-a", "-d", "-p", "_static-" , "-o", "str\\else", "in1.txt", "in2.txt"};
        Configuration configuration = Configuration.getInstance();
        ConfigurationSetController.setConfig(argss, configuration);
        System.out.println(configuration.toString());
        FileHandler.readFile(configuration.getListOfFileName());
        FileHandler.writeFile(configuration.getSavePath(), configuration.getPrefix(), configuration.getA());
        StatisticsController.setStatistics(configuration.getS(), configuration.getA());
        StatisticsController.viewStatistics(configuration.getS(), configuration.getF());
    }
}