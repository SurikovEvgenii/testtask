package ru.surikov;

public class ConfigurationCheck {

    public void checkConfig(String[] args) {

        for (int i = 0; i < args.length; i++) {
            if (args[i].startsWith("-")) {

                if (args[i].contains("s")) {
                    System.out.println("Param -s: " + true);
                } else if (args[i].contains("f")) {
                    System.out.println("Param -f: " + true);
                } else if (args[i].contains("a")) {
                    System.out.println("Param -a: " + true);
                } else if (args[i].contains("o")) {

                    System.out.println("Param -o: " + true);

                    if(args[i+1].contains("\\")){
                        System.out.println("Path param: " + args[i+1]);
                    } else {
                        System.out.println("Path param not found");
                    }
                } else if (args[i].contains("p")) {
                    System.out.println("Param -p: " + true);

                    if(args[i+1].matches("^(?!-).*$")){
                        System.out.println("Param -p Prefix: " + args[i+1]);
                    } else {
                        System.out.println("Prefix -p not found");
                    }
                } else {
                    System.out.println("Unknown parameter: " + args[i]);
                }
            }

            if (args[i].endsWith(".txt")) {
                System.out.println("Input file: " + args[i]);
            }

        }
    }
}
