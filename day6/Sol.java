package day6;
import java.util.*;


public class Sol {
    
    public static void main(String[] args) {
        ArrayList<String> race = FileReader.getTxt("day6/input.txt");

        String[] time = race.get(0).split(" ");
        String[] dist = race.get(1).split(" ");

        ArrayList<Integer> timeArr = new ArrayList<>();
        ArrayList<Integer> distArr = new ArrayList<>();

        for(String t : time) {
            if(t.length() != 0) {
                timeArr.add(Integer.parseInt(t));
            }
        }

        for(String d : dist) {
            if(d.length() != 0) {
                distArr.add(Integer.parseInt(d));
            }
        }

        System.out.println(timeArr);
        System.out.println(distArr);

    }

}
    
    
