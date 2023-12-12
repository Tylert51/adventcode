package day1;

import java.util.ArrayList;

public class Sol2 {
    public static void main(String[] args) {

        System.out.println("\n\n");

        ArrayList<String> text = FileReader.getTxt("day1/input2.txt");
        System.out.println(text);

        int sum = 0;

        String[] numbers = new String[] { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        for (String str : text) {
            String newStr = str;
            for (int i = 0; i < numbers.length; i++) {
                newStr = findAndReplaceAll(newStr, numbers[i], (i + 1) + "");
            }

            System.out.println(newStr);
            String num = getNum(newStr);
            sum += Integer.parseInt(num);
        }

        System.out.println(sum);

        // String test = "eightwothree";

        // System.out.println(findAndReplaceAll(test, "eight", "8"));

        System.out.println("\n\n");
    }

    public static String getNum(String txt) {
        String digits = "0123456789";
        ArrayList<String> numbers = new ArrayList<>();

        for (int i = 0; i < txt.length(); i++) {

            String letter = txt.charAt(i) + "";

            if (digits.contains(letter)) {
                numbers.add(letter);
            }
        }

        return numbers.get(0) + numbers.get(numbers.size() - 1);
    }

    public static String findAndReplaceAll(String str, String word, String replacement) {

        int ind = str.indexOf(word);

        if (ind == -1) {
            return str;
        } else {
            String newStr = str.substring(0, ind + 1) + replacement + str.substring(ind + 1);

            return findAndReplaceAll(newStr, word, replacement);
        }

    }
}
