
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        scanner.close();

        double squareRoot = Math.sqrt(first + second);
        System.out.println(squareRoot);
    }
}
