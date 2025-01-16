package ru.surikov.controllers;

import ru.surikov.entities.Configuration;

public class ConfigurationSetController {

    public void setConfig(String[] args, Configuration config) {
        try {
            for (int i = 0; i < args.length; i++) {
                if (args[i].endsWith(".txt")) {
                    config.addFileName(args[i]);
                }
                if (args[i].startsWith("-")) {
                    if (args[i].contains("s")) {
                        config.setS(true);
                    }
                    if (args[i].contains("f")) {
                        config.setF(true);
                    }
                    if (args[i].contains("a")) {
                        config.setA(true);
                    }
                    if (args[i].contains("o")) {
                        config.setO(true);
                            if(args[i+1].contains("\\")){
                                config.setSavePath(args[i+1]);
                            } else {
                                System.out.println("Path param not found");
                            }
                    }
                    if (args[i].contains("p")) {
                        config.setP(true);
                            if(args[i+1].matches("^(?!-).*$")){
                                config.setPrefix(args[i+1]);
                            } else {
                                System.out.println("Prefix -p not found");
                            }
                    }
                }
            }
        } catch (Exception e) {

        }
    }
}
