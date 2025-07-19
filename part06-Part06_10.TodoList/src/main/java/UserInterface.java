import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (isUnknownCommand(command)) {
                System.out.println("Unknown command");
                continue;
            }

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                add();
                continue;
            }

            if (command.equals("remove")) {
                remove();
                continue;
            }

            if (command.equals("list")) {
                list.print();
                continue;
            }
        }
    }

    private boolean isUnknownCommand(String command) {
        String [] commands = {"add", "remove", "list", "stop"};

        for (String element: commands) {
            if (command.equals(element)) {
                return false;
            }
        }

        return true;
    }

    private void add() {
        System.out.print("To add: ");
        list.add(scanner.nextLine());
    }

    private void remove() {
        System.out.print("Which one is removed? ");
        list.remove(scanner.nextInt());
    }
}
