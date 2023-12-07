
public class Sol {
    public static void main(String[] args) {
        String[] games = FileReader.getTxt("day2/input.txt");
        System.out.println("\n\n");

        int maxRed = 12;
        int maxGreen = 13;
        int maxBlue = 14;

        int sum = 0;

        for (int i = 0; i < games.length; i++) {
            String game = games[i];

            String[] rounds = game.split("; ");
            String merge = String.join(", ", rounds);
            String[] cases = merge.split(", ");

            boolean possible = true;

            for (String turn : cases) {
                String[] values = turn.split(" ");
                // System.out.println(Arrays.toString(values));

                if ((Integer.parseInt(values[0]) > maxRed && values[1].equals("red"))
                        || (Integer.parseInt(values[0]) > maxBlue && values[1].equals("blue"))
                        || (Integer.parseInt(values[0]) > maxGreen && values[1].equals("green"))) {

                    possible = false;
                    break;
                }
            }

            if (possible) {
                sum += (i + 1);
            }

        }

        System.out.println(sum);

        System.out.println("\n\n");
    }
}
