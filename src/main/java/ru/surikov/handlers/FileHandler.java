package ru.surikov.handlers;

import ru.surikov.controllers.CheckTypeOfDataController;
import ru.surikov.entities.DataLists;

import java.io.*;
import java.util.Iterator;
import java.util.List;

public class FileHandler {

    public static void readFile(List<String> fileNameList) {

        Iterator<String> iterator = fileNameList.iterator();

        while (iterator.hasNext()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(iterator.next()))) {
                while (bufferedReader.ready()) {
                    String line = bufferedReader.readLine();
                    if (CheckTypeOfDataController.isDouble(line)) {
                        DataLists.addDataToDoubleList(Double.parseDouble(line));
                    }
                    if (CheckTypeOfDataController.isLong(line)) {
                        DataLists.addDataToLongList(Long.parseLong(line));
                    }
                    if (CheckTypeOfDataController.isString(line)) {
                        DataLists.addDataToStringList(line);
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error reading file");
            } catch (NumberFormatException e) {
                System.out.println("Error parsing number");
            }
        }
    }

    public static void writeFile(String path, String prefix, boolean append) {

        try {
            if (!DataLists.getDoubleList().isEmpty()) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(prefix + "double.txt", append));
                Iterator iterator = DataLists.getDoubleList().iterator();
                while (iterator.hasNext()) {
                    bufferedWriter.write(iterator.next().toString());
                    bufferedWriter.newLine();
                }
                bufferedWriter.flush();
            }
            if (!DataLists.getLongList().isEmpty()) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(prefix + "integer.txt", append));
                Iterator iterator = DataLists.getLongList().iterator();
                while (iterator.hasNext()) {
                    bufferedWriter.write(iterator.next().toString());
                    bufferedWriter.newLine();
                }
                bufferedWriter.flush();
            }
            if (!DataLists.getStringList().isEmpty()) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(prefix + "string.txt", append));
                Iterator iterator = DataLists.getStringList().iterator();
                while (iterator.hasNext()) {
                    bufferedWriter.write((String) iterator.next());
                    bufferedWriter.newLine();
                }
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
