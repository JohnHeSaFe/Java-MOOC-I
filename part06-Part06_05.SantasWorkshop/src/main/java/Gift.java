public class Gift {
    private String name;
    private int weight;

    public Gift(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public String toString() {
        String printOut = "";

        printOut += "Gift's name: " + this.name + "\n";
        printOut += "Gift's weight: " + this.weight + "\n";
        printOut += "Gift: " + this.name + " (" + this.weight + " kg)";

        return printOut;
    }
}
