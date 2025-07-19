
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        PointsStatistics pointsStats = new PointsStatistics();


        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            String input = scanner.nextLine();
            int number = Integer.valueOf(input);

            if (number == -1) {
                break;
            }

            pointsStats.addPoint(number);
        }
        System.out.println("Point average (all): " + pointsStats.getAverage());

        if (pointsStats.getAveragePassingGrade() == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + pointsStats.getAveragePassingGrade());
        }
    
        System.out.println("Pass percentage: " + pointsStats.getPassPercentage());

        pointsStats.printGradeDistribution();
    }
}
