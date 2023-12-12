package day4;

import java.util.ArrayList;
import java.util.Arrays;

public class Sol {
    public static void main(String[] args) {
        ArrayList<String> games = FileReader.getTxt("day4/test.txt");

        System.out.println("\n\n\n");

        for (int i = 0; i < 1; i++) {

            ArrayList<String[]> numbers = new ArrayList<>();

            String round = games.get(i);

            String[] lines = round.split(" \\| ");

            numbers.add(lines[0].split(" "));
            numbers.add(lines[1].split(" "));

            print2DArr(numbers);

        }

        // System.out.println(games);

        System.out.println("\n\n\n");
    }

    public static void print2DArr(ArrayList<String[]> arr2d) {
        for (String[] arr : arr2d) {
            System.out.println(Arrays.toString(arr));
        }
    }

}
