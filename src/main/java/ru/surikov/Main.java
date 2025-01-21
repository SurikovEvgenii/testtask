package ru.surikov;

import ru.surikov.controllers.ConfigurationSetController;
import ru.surikov.controllers.StatisticsController;
import ru.surikov.entities.Configuration;
import ru.surikov.handlers.FileHandler;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        ConfigurationSetController.setConfig(args, configuration);
        System.out.println(configuration.toString());
        FileHandler.readFile(configuration.getListOfFileName());
        FileHandler.writeFile(configuration.getSavePath(), configuration.getPrefix(), configuration.getA());
        StatisticsController.setStatistics(configuration.getS(), configuration.getF());
        StatisticsController.viewStatistics(configuration.getS(), configuration.getF());
    }
}