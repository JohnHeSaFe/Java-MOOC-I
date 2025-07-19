
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.print("Search for? ");
        String name = String.valueOf(scanner.nextLine());

        System.out.print(name + " ");
        if (list.contains(name)) {
            System.out.println("was found!");
        } else {
            System.out.println("was not found!");
        }
    }
}
