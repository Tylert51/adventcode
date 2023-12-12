package day4;

import java.util.ArrayList;
import java.util.Arrays;

public class Sol2 {
    public static void main(String[] args) {
        ArrayList<String> games = FileReader.getTxt("day4/input.txt");

        System.out.println("\n\n\n");

        int[] freq = new int[games.size()];

        for(int i = 0; i < freq.length; i++) {
            freq[i] = 1;
        }

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

            for(int j = 1; j <= score; j++) {
                freq[i + j] += freq[i];
            }

        }

        int sum = 0;

        for(int num : freq) {
            sum += num;
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

