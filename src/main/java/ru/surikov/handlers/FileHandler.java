package ru.surikov.handlers;

import ru.surikov.controllers.CheckTypeOfDataController;
import ru.surikov.entities.DataLists;

import java.io.*;
import java.util.Iterator;

public class FileHandler {

    public void readFile() {

        File file = new File("in1.txt");

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                    if(CheckTypeOfDataController.isDouble(line)) {
                        Double doubleData = Double.parseDouble(line);
                        DataLists.addDataToDoubleList(doubleData);
                    }
                    if (CheckTypeOfDataController.isInteger(line)) {
                        Integer integerData = Integer.parseInt(line);
                        DataLists.addDataToIntegerList(integerData);
                    }
                    if (CheckTypeOfDataController.isString(line)) {
                        DataLists.addDataToStringList(line);
                    }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeFile(String path, String prefix, boolean append) {
        try {
            if(!DataLists.getDoubleList().isEmpty()) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(prefix + "double.txt", append));
                Iterator iterator = DataLists.getDoubleList().iterator();
                while(iterator.hasNext()) {
                    bufferedWriter.write(iterator.next().toString());
                    bufferedWriter.newLine();
                }
                bufferedWriter.flush();
            }
            if(!DataLists.getIntegerList().isEmpty()) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(prefix + "integer.txt", append));
                Iterator iterator = DataLists.getIntegerList().iterator();
                while(iterator.hasNext()) {
                    bufferedWriter.write(iterator.next().toString());
                    bufferedWriter.newLine();
                }
                bufferedWriter.flush();
            }
            if(!DataLists.getStringList().isEmpty()) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(prefix + "string.txt", append));
                Iterator iterator = DataLists.getStringList().iterator();
                while(iterator.hasNext()) {
                    bufferedWriter.write((String)iterator.next());
                    bufferedWriter.newLine();
                }
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
