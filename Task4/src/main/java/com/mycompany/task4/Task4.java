
package com.mycompany.task4;

import java.io.*;

public class Task4{
    public static void main(String[] args) {
        String fileName = "sample.txt"; 

        try {
            
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            System.out.println("Contents of the file \"" + fileName + "\":\n");

           
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
