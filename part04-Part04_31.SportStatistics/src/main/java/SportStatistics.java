
import java.nio.file.Paths;
import java.util.Scanner;


public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            int games = 0;
            int wins = 0;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.equals("")) {
                    continue;
                }
                String[] parts = line.split(",");
                String[] teams = {parts[0], parts[1]};
                int[] scores = {Integer.valueOf(parts[2]), Integer.valueOf(parts[3])};

                if (team.equals(teams[0]) || team.equals(teams[1])) {
                    games++;

                    if ((team.equals(teams[0]) && scores[0] > scores[1]) || (team.equals(teams[1]) && scores[1] > scores[0])) {
                        wins++;
                    }
                }
            }

            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + (games - wins));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
