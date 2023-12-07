package day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Symbol {
    private int[] coord;
    private ArrayList<int[]> surroundings; 
    private ArrayList<Number> numSurroundings;

    public Symbol (int[] coords) {
        coord = coords;
        surroundings = new ArrayList<>();
        numSurroundings = new ArrayList<Number>();
    }

    public void setSurroundings(ArrayList<int[]> surr) {
        surroundings = surr;
    }

    public void printSurroundings() {
        for(int[] coord: surroundings) {
            System.out.println(Arrays.toString(coord));
        }
    }

    public void printNumSurroundings() {
        for(Number num: numSurroundings) {
            
            System.out.println(num.getValue());

        }
        System.out.println("------");
    }

    public void printCoords() {
        System.out.println(Arrays.toString(coord));
    }

    public int[] getCoords() {
        return coord; 
    }

    public ArrayList<int[]> getSurroundings() {
        return surroundings;
    }

    public ArrayList<Number> getNumSurroundings() {
        return numSurroundings;
    }

    public void addNum(Number num) {
        numSurroundings.add(num);
    }
}
