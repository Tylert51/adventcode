package day1;
import java.util.ArrayList;

public class Number {
    public static void main(String[] args) {

        System.out.println("\n\n");

        ArrayList<String> text = FileReader.getTxt("day1/input.txt");

        int sum = 0; 

        for(int i = 0; i < text.size(); i++) {
            int num = Integer.parseInt(getNum(text.get(i)));
            sum += num;
        }

        System.out.println(sum);

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
        
    

}
