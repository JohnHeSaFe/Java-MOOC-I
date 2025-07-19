import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager jokes;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.scanner = scanner;
        this.jokes = jokes;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");

            String command = scanner.nextLine();

            switch (command) {
                case "X":
                    return;

                case "1":
                    System.out.println("Write the joke to be added:");
                    String joke = scanner.nextLine();
                    jokes.addJoke(joke);
                    break;

                case "2":
                    System.out.println("Drawing a joke.");
                    System.out.println(jokes.drawJoke());
                    break;

                case "3":
                    System.out.println("Printing the jokes.");
                    jokes.printJokes();
                    break;

                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
