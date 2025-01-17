package ru.surikov.controllers;

import ru.surikov.entities.Configuration;
import ru.surikov.exceptions.PrefixNotFoundException;
import ru.surikov.exceptions.SystemPathParamNotFound;

public class ConfigurationSetController {

    public static void setConfig(String[] args, Configuration config) {
        try {
            for (int i = 0; i < args.length; i++) {
                if (args[i].endsWith(".txt")) {
                    config.addFileName(args[i]);
                }
                if (args[i].startsWith("-")) {
                    if (args[i].contains("s") && !config.getF()) {
                        config.setS(true);
                    }
                    if (args[i].contains("f")) {
                        if (config.getS()) {
                            config.setS(false);
                        }
                        config.setF(true);
                    }
                    if (args[i].contains("a")) {
                        config.setA(true);
                    }
                    if (args[i].contains("o")) {
                        config.setO(true);
                        if (args[i + 1].contains("\\")) {
                            config.setSavePath(args[i + 1]);
                        } else {
                            throw new SystemPathParamNotFound("System path param not found");
                        }
                    }
                    if (args[i].contains("p")) {
                        config.setP(true);
                        if (args[i + 1].matches("^(?!-).*$")) {
                            config.setPrefix(args[i + 1]);
                        } else {
                            throw new PrefixNotFoundException("Prefix not found!");
                        }
                    }
                }
            }
        } catch (PrefixNotFoundException | SystemPathParamNotFound e) {
            System.out.println(e.getMessage());
        }
    }
}
