

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int x) {
        for (int i = x; i > 0; i--) {
            System.out.println(i);
        }
    }
}
