package day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Sol2 {
    public static void main(String[] args) {

        String[][] sheet = FileReader.getTxt("day3/input.txt");
        ArrayList<Symbol> symbols = findSymbols(sheet);
        ArrayList<Number> numbers = findNumbers(sheet);
        // ArrayList<int[]> possibArr = findPossibleSpots(sheet, symbolCoords);

        printArr(sheet);

        for(Symbol sym : symbols) {
            findPossibleSpots(sym);
            // sym.printSurroundings();
            // System.out.println("----------");
        }

        for (Number num : numbers) {
            for (int[] coord : num.getCoords()) {

                boolean foundNum = false;

                for(Symbol sym : symbols) {
                    

                    if(doesContain(sym.getSurroundings(), coord)) {
                        sym.addNum(num);
                        foundNum = true;
                        break;
                    }


                }

                if(foundNum) {
                    break;
                }
            }
        }

        int sum = 0;

        for(Symbol sym : symbols) {

            ArrayList<Number> temp = sym.getNumSurroundings();
                    
            if(temp.size() == 2) {
                sum += temp.get(0).getValue() * temp.get(1).getValue();
            }
        }

        System.out.println(sum);

    }

    public static ArrayList<Symbol> findSymbols(String[][] sheet) {
        String symbols = "*";
        ArrayList<Symbol> symbolsArr = new ArrayList<>();

        for (int i = 0; i < sheet.length; i++) {
            for (int j = 0; j < sheet[0].length; j++) {
                String symbol = sheet[i][j];

                if (symbols.contains(symbol)) {
                    symbolsArr.add(new Symbol(new int[] { i, j }));
                }

            }
        }

        return symbolsArr;
    }

    public static ArrayList<Number> findNumbers(String[][] sheet) {
        String numbers = "0123456789";
        ArrayList<Number> numArr = new ArrayList<>();

        for (int i = 0; i < sheet.length; i++) {

            String num = "";
            ArrayList<int[]> tempCoords = new ArrayList<>();

            for (int j = 0; j < sheet[0].length; j++) {
                String character = sheet[i][j];

                if (numbers.contains(character)) {
                    num += character;
                    tempCoords.add(new int[] { i, j });

                } else if (num.length() != 0) {
                    numArr.add(new Number(Integer.parseInt(num), (ArrayList<int[]>) tempCoords.clone()));
                    num = "";
                    tempCoords.clear();
                }
            }
        }

        // printArrNum(numArr);
        // System.out.println(numArr.size());

        return numArr;
    }

    public static void findPossibleSpots(Symbol sym) {
        ArrayList<int[]> possibArr = new ArrayList<>();

        int[] coords = sym.getCoords();

        possibArr.add(new int[] { coords[0] - 1, coords[1] });

        possibArr.add(new int[] { coords[0] - 1, coords[1] + 1 });

        possibArr.add(new int[] { coords[0], coords[1] + 1 });

        possibArr.add(new int[] { coords[0] + 1, coords[1] + 1 });

        possibArr.add(new int[] { coords[0] + 1, coords[1] });

        possibArr.add(new int[] { coords[0] + 1, coords[1] - 1 });

        possibArr.add(new int[] { coords[0], coords[1] - 1 });

        possibArr.add(new int[] { coords[0] - 1, coords[1] - 1 });

        sym.setSurroundings(possibArr);
        
    }

    public static void printArr(String[][] arr) {
        for (String[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void printArr(ArrayList<int[]> arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void printArrNum(ArrayList<Number> arr) {
        for (Number num : arr) {
            System.out.println(num.getValue());

            ArrayList<int[]> coords = num.getCoords();
            printArr(coords);

            System.out.println("----------");
        }
    }

    public static boolean isOutOfBounds(int num, String[][] sheet) {

        return (num < 0) || (num >= sheet.length);

    }

    public static boolean doesContain(ArrayList<int[]> coords, int[] coord) {
        for (int[] indivCoord : coords) {
            if (Arrays.equals(indivCoord, coord)) {
                return true;
            }
        }

        return false;
    }

}
