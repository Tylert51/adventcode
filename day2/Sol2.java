import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;

public class Sol2 {
    public static void main(String[] args) {
        String[] games = FileReader.getTxt("day2/input.txt");
        System.out.println("\n\n");

        int sum = 0;

        for (int i = 0; i < games.length; i++) {
            String game = games[i];

            String[] rounds = game.split("; ");
            String merge = String.join(", ", rounds);
            String[] cases = merge.split(", ");

            ArrayList<ArrayList<Integer>> nums = new ArrayList<ArrayList<Integer>>();
            for (int j = 0; j < 3; j++) {
                nums.add(new ArrayList<Integer>());
            }

            for (int j = 0; j < cases.length; j++) {

                String turn = cases[j];

                String[] values = turn.split(" ");
                // System.out.println(Arrays.toString(values));

                if (values[1].equals("red")) {
                    nums.get(0).add(Integer.parseInt(values[0]));
                } else if (values[1].equals("green")) {
                    nums.get(1).add(Integer.parseInt(values[0]));
                } else if (values[1].equals("blue")) {
                    nums.get(2).add(Integer.parseInt(values[0]));
                }
            }

            for (int j = 0; j < 3; j++) {
                Collections.sort(nums.get(j));
                Collections.reverse(nums.get(j));
                // System.out.println(nums.get(j));
            }
            System.out.println(nums);

            sum += (nums.get(0).get(0) * nums.get(1).get(0) * nums.get(2).get(0));

        }

        System.out.println(sum);

        System.out.println("\n\n");
    }
}
