package day1;

import java.util.ArrayList;

public class Sol2 {
    public static void main(String[] args) {

        System.out.println("\n\n");

        ArrayList<String> text = FileReader.getTxt("day1/test.txt");

        int sum = 0; 

        String test = "01234";

        

        // System.out.println(text);

        System.out.println("\n\n");
    }


    public static String getNum(String txt) {
        String digits = "0123456789";
        ArrayList<String> numbers = new ArrayList<>();


        for(int i = 0; i < txt.length(); i++) {
            
            String letter =  txt.charAt(i) + "";
            
            if(digits.contains(letter)) {
                numbers.add(letter);
            }
        }

        return numbers.get(0) + numbers.get(numbers.size() - 1);
    }

    public static String findAndReplaceAll(String str, String word, String replacemnt) {
        
        int ind = str.indexOf(word);

        if(ind == 0) {
            return str;
        } else {
            String new 
        }


        
        return str;
    }
}


