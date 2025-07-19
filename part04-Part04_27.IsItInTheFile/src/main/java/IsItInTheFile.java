
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        boolean found = false;
        try (Scanner nameScanner = new Scanner(Paths.get(file))) {
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();

            while (nameScanner.hasNextLine()) {
                String name = nameScanner.nextLine();
                if (name.equals(searchedFor)) {
                    found = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + "failed.");
        }

        if (found == true) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }

    }
}
