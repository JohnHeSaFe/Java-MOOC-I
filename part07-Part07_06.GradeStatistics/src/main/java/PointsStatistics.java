import java.util.ArrayList;

public class PointsStatistics {
    private ArrayList<Integer> points;

    public PointsStatistics() {
        points = new ArrayList<Integer>();
    }

    public void addPoint(int number) {
        if (number >= 0 && number <= 100) {
            points.add(number);
        }
    }

    public double getAverage() {
        if (points.isEmpty()) {
            return -1;
        }

        int sum = 0;
        for (int point : points) {
            sum += point;
        }

        return (double) sum / points.size();
    }

    public double getAveragePassingGrade() {
        if (points.isEmpty()) {
            return -1;
        }

        int sum = 0;
        int count = 0;
        for (int point : points) {
            if (point < 50) {
                continue;
            }

            sum += point;
            count++;
        }

        if (sum == 0) {
            return -1;
        }
        
        return (double) sum / count;
    }

    public double getPassPercentage() {
        if (points.isEmpty()) {
            return -1;
        }

        int count = 0;
        for (int point : points) {
            if (point >= 50) {
                count++;
            }
        }

        return (double) 100 * count / points.size();
    }

    public void printGradeDistribution() {
        int[] stars = new int[6];

        for (int point: points) {
            if (point < 50) {
                stars[0]++;
            } else if (point < 60) {
                stars[1]++;
            } else if (point < 70) {
                stars[2]++;
            } else if (point < 80) {
                stars[3]++;
            } else if (point < 90) {
                stars[4]++;
            } else {
                stars[5]++;
            }
        }
        
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            System.out.println("*".repeat(stars[i]));
            System.out.println();
        }
    }
}
