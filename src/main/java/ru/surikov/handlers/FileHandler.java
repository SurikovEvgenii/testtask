package ru.surikov.handlers;

import ru.surikov.controllers.CheckTypeOfDataController;
import ru.surikov.entities.DataLists;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
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

    public static void writeFile(String savePath, String prefix, boolean append) {
        try {
            Files.createDirectories(Paths.get(savePath));
            File fileDouble = Paths.get(savePath, prefix + "double").toFile();
            File fileLong = Paths.get(savePath, prefix + "integer").toFile();
            File fileString = Paths.get(savePath, prefix + "string").toFile();

            if (!DataLists.getDoubleList().isEmpty()) {
                write(fileDouble, append, DataLists.getDoubleList().iterator());
            }
            if (!DataLists.getLongList().isEmpty()) {
                write(fileLong, append, DataLists.getLongList().iterator());
            }
            if (!DataLists.getStringList().isEmpty()) {
                write(fileString, append, DataLists.getStringList().iterator());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void write(File file, boolean append, Iterator iterator)  {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, append))){
            while (iterator.hasNext()) {
                bufferedWriter.write(iterator.next().toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
