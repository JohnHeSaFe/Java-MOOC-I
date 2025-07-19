import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> hold;
    private int maxWeight;

    public Hold(int maxWeight) {
        hold = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() <= maxWeight) {
            maxWeight -= suitcase.totalWeight();
            hold.add(suitcase);
        }
    }

    public String toString() {
        return hold.size() + "suitcases (" + this.totalWeight() + " kg)";
    }

    private int totalWeight() {
        int totalWeight = 0;

        for (Suitcase suitcase: this.hold) {
            totalWeight += suitcase.totalWeight();
        }

        return totalWeight;
    }

    public void printItems() {
        System.out.println("The suitcases in the hold contain the following items:");
        for (Suitcase suitcase: this.hold) {
            suitcase.printItems();
        }
    }
}
