
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstAccount = {"alex", "sunshine"};
        String[] secondAccount = {"emma", "haskell"};

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if ((username.equals(firstAccount[0]) && password.equals(firstAccount[1])) || (username.equals(secondAccount[0]) && password.equals(secondAccount[1]))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
