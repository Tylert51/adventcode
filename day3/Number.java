package day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Number {
    private int value;
    private ArrayList<int[]> coords;

    public Number(int val, ArrayList<int[]> coords) {
        value = val;
        this.coords = coords;
    }

    public int getValue() {
        return value;
    }

    public ArrayList<int[]> getCoords() {
        return coords;
    }

    public void printNum() {
        System.out.println(value);
        for (int[] row : coords) {
            System.out.println(Arrays.toString(row));
        }
    }

}
