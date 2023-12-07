package day1;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

public class FileReader {
    public static ArrayList<String> getTxt(String fileName) {
        ArrayList<String> txt = new ArrayList<String>();
        try {
            File textFile = new File(fileName);
            try (Scanner reader = new Scanner(textFile)) {
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();
                    txt.add(line);
                }
            }
        }
        catch (FileNotFoundException noFile) {
            System.out.println("File not found!");
            return null;
        }
        return txt;
    }

} 