
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
//import java.util.ArrayList;

public class FileReader {
    public static String[] getTxt(String fileName) {

        String[] games = new String[100];

        try {
            File textFile = new File(fileName);
            try (Scanner reader = new Scanner(textFile)) {
                int i = 0;
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();
                    String gameStr = line.substring(line.indexOf(":") + 2);
                    games[i] = gameStr;
                    i++;
                }
            }
        } catch (FileNotFoundException noFile) {
            System.out.println("File not found!");
            return null;
        }
        return games;
    }

}