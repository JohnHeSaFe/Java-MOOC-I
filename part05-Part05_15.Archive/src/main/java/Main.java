
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();        

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.equals("")) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            User user = new User(identifier, name);
            if (users.contains(user)) {
                continue;
            }
            
            users.add(user);
        }

        System.out.println("==Items==");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
