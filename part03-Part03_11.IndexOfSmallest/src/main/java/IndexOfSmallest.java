
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 9999) {
                break;
            }

            list.add(number);
        }

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest = 9999;
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (smallest > list.get(i)) {
                smallest = list.get(i);
                indexes.clear();
                indexes.add(i);
            } else if (smallest == list.get(i)) {
                indexes.add(i);
            }
        }

        System.out.println("Smallest number: " + smallest);
        for (int index : indexes) {
            System.out.println("Found at index " + index);
        }
    }
}
