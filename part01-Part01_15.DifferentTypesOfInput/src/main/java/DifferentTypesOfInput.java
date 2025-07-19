
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String text = String.valueOf(scan.nextLine());
        System.out.println("Give an integer:");
        int numberInteger = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double numberDouble = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + numberInteger);
        System.out.println("You gave the double " + numberDouble);
        System.out.println("You gave the boolean " + bool);
    }
}
