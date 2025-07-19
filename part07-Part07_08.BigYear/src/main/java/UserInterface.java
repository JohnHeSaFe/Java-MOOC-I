import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private ArrayList<Bird> birds;
    private Scanner scanner;

    public UserInterface(ArrayList<Bird> birds, Scanner scanner) {
        this.birds = birds;
        this.scanner = scanner;
    }

    public void start() {
        String option;
        while (true) {
            System.out.print("? ");
            option = this.scanner.nextLine();

            switch (option) {
                case "Add":
                    addBird(birds);
                    break;
                case "Observation":
                    observationBird(birds);
                    break;
                case "All":
                    printAllBirds(birds);
                    break;
                case "One":
                    printOneBird(birds);
                    break;
                case "Quit":
                    return;
                default:
                    System.out.println("Not an option!");
                    break;
            }
        }
    }

    public void addBird(ArrayList<Bird> birds) {
        System.out.print("Name: ");
        String name = this.scanner.nextLine();

        System.out.print("Name in Latin: ");
        String nameInLatin = this.scanner.nextLine();
        
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                System.out.println("Bird already in database!");
                return;
            }
        }

        birds.add(new Bird(name, nameInLatin));
    }

    public void observationBird(ArrayList<Bird> birds) {
        System.out.print("Bird? ");
        String input = this.scanner.nextLine();

        for (Bird bird : birds) {
            if (bird.getName().equals(input)) {
                bird.addObservation();
                return;
            }
        }

        System.out.println("Not a bird!");
    }

    public void printAllBirds(ArrayList<Bird> birds) {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public void printOneBird(ArrayList<Bird> birds) {
        System.out.print("Bird? ");
        String input = this.scanner.nextLine();

        for (Bird bird : birds) {
            if (bird.getName().equals(input)) {
                System.out.println(bird);
                return;
            }
        }

        System.out.println("Not a bird!");
    }
}
