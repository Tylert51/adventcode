package day3;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class FileReader {
    public static String[][] getTxt(String fileName) {
        int len = 140;
        String[][] txt = new String[len][len + 1];
        try {
            File textFile = new File(fileName);
            try (Scanner reader = new Scanner(textFile)) {
                int i = 0;
                while (reader.hasNextLine()) {
                    String line = reader.nextLine() + ".";
                    String[] indiv = line.split("");
                    txt[i] = indiv;
                    i++;
                }
            }
        } catch (FileNotFoundException noFile) {
            System.out.println("File not found!");
            return null;
        }
        return txt;
    }

}