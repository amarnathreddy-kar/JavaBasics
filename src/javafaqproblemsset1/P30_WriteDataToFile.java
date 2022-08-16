package javafaqproblemsset1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class P30_WriteDataToFile {

    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("/home/amar/Downloads/code/JavaBasics/src/javafaqproblemsset1/TestFile.txt");
        BufferedWriter writer = new BufferedWriter(file);

        writer.write("Welcome to the world of Java \n");
        writer.write("This file is created by Buffered Writer and file Writer\n");

        System.out.println("Writing Completed!");

        writer.close();
    }
}
