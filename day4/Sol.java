package day4;

import java.util.ArrayList;
import java.util.Arrays;

public class Sol {
    public static void main(String[] args) {
        ArrayList<String> games = FileReader.getTxt("day4/test.txt");

        System.out.println("\n\n\n");

        int sum = 0;

        for (int i = 0; i < games.size(); i++) {

            int score = 0;

            ArrayList<String[]> numbers = new ArrayList<>();

            String round = games.get(i);

            String[] lines = round.split(" \\| ");

            numbers.add(lines[0].split(" "));
            numbers.add(lines[1].split(" "));

            for(String num : numbers.get(0)) {
                if(!num.equals("") && doesContain(num, numbers.get(1))) {
                    score++;
                }
            }

            sum += Math.pow(2, score - 1);

        }

        System.out.println(sum);

        System.out.println("\n\n\n");
    }

    public static void print2DArr(ArrayList<String[]> arr2d) {
        for (String[] arr : arr2d) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static boolean doesContain(String str, String[] arr) {
        for(String string : arr) {
            if(str.equals(string)) {
                return true;
            }
        }

        return false;
    }

}
