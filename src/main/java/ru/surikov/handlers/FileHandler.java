package ru.surikov;

import java.io.*;

public class FileHandler {

    public void findTypeOfData() {

        File file = new File("in1.txt");

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            while (bufferedReader.ready()) {

                String line = bufferedReader.readLine();

                if(CheckTypeOfData.isDouble(line)) {

                } else if (CheckTypeOfData.isInteger(line)) {
                    
                } else if (CheckTypeOfData.isString(line)) {
                    
                }

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
