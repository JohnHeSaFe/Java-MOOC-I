import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (isUnknownCommand(command)) {
                System.out.println("Unknown command");
                continue;
            }

            if (command.equals("end")) {
                break;
            }

            if (command.equals("search")) {
                search();
                continue;
            }

            add();
        }   

        System.out.println("Bye bye!");
    }

    private boolean isUnknownCommand(String command) {
        String [] commands = {"add", "remove", "search", "end"};

        for (String element: commands) {
            if (command.equals(element)) {
                return false;
            }
        }

        return true;
    }

    private void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();

        System.out.print("Translation: ");
        String translation = scanner.nextLine();

        dictionary.add(word, translation);
    }

    private void search() {
        System.out.print("To be translated: ");
        String word = scanner.nextLine();

        String translation = dictionary.translate(word);

        if (translation == null) {
            System.out.println("Word " + word + " was not found");
            return;
        }

        System.out.println("Translation: " + translation);
    }
}
