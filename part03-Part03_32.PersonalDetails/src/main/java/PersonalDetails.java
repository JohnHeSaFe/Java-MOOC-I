
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        ArrayList<Integer> birthYears = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] data = input.split(",");

            if (data[0].length() > longestName.length()) {
                longestName = data[0];
            }

            birthYears.add(Integer.valueOf(data[1]));

        }

        int sumBirthYears = 0;
        for (int birthYear : birthYears) {
            sumBirthYears += birthYear;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((float) sumBirthYears / birthYears.size()));
    }
}
