
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = Integer.valueOf(scan.nextLine());
        scan.close();
        if (!(age < 0 || age > 120)) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
