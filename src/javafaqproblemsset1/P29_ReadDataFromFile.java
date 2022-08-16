package javafaqproblemsset1;

import java.io.*;
import java.util.Scanner;

public class P29_ReadDataFromFile {

    public static void main(String[] args) throws IOException {

        //Approach1: using FileReader BufferedReader
        FileReader file = new FileReader("/home/amar/Downloads/code/JavaBasics/src/javafaqproblemsset1/Sample.txt");
        BufferedReader reader = new BufferedReader(file);

        String str="";
        while((str= reader.readLine())!=null){
            System.out.println(str);
        }
        reader.close();

        System.out.println("----------------------------------------------------------------------------------------");
        //Approach2: Using Scanner and File
        /*
        System.out.println("Using Scanner to read a text file");
        File f = new File("/home/amar/Downloads/code/JavaBasics/src/javafaqproblemsset1/ScannerSample.txt");
        Scanner scanner = new Scanner(f);

        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    */
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Using delimiter without iterative loop");
        //Approach3: Using Delimiter

        File f = new File("/home/amar/Downloads/code/JavaBasics/src/javafaqproblemsset1/ScannerSample.txt");
        Scanner scanner = new Scanner(f);
        scanner.useDelimiter("\\Z");
        System.out.println(scanner.next());

        scanner.close();
    }
}
