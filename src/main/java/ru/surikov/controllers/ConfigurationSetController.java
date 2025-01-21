package ru.surikov.controllers;

import ru.surikov.entities.Configuration;
import ru.surikov.exceptions.PrefixNotFoundException;
import ru.surikov.exceptions.SystemPathParamNotFound;

import java.nio.file.Paths;

public class ConfigurationSetController {

    public static void setConfig(String[] args, Configuration config) {
        try {
            for (int i = 0; i < args.length; i++) {
                if (args[i].endsWith(".txt")) {
                    config.addFileName(Paths.get(args[i]).toAbsolutePath().toString());
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
                        if (args[i + 1].matches("^(?!-).*$")) {;
                            config.setSavePath(Paths.get(args[i + 1]).toAbsolutePath().toString());
                        }
                    }
                    if (args[i].contains("p")) {
                        config.setP(true);
                        if (args[i + 1].matches("^(?!-).*$")) {
                            config.setPrefix(args[i + 1]);
                        }
                    }
                }
            }

            if(config.getP() && config.getPrefix() == null) {
                config.setPrefix("");
                throw new PrefixNotFoundException("Prefix not found!");
            }
            if(config.getO() && config.getSavePath() == null) {
                throw new SystemPathParamNotFound("Save path not found! Please enter a save path after param -o");
            }

        } catch (PrefixNotFoundException e) {
            config.setPrefix("");
            System.out.println(e.getMessage());
        } catch (SystemPathParamNotFound e) {
            config.setSavePath("");
            System.out.println(e.getMessage());
        }
    }
}
