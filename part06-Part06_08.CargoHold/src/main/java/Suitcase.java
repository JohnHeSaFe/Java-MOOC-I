import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (item.getWeight() <= maxWeight) {
            maxWeight -= item.getWeight();
            items.add(item);
        }
    }

    public String toString() {
        String printOut = "";

        int totalWeight = totalWeight();

        switch (items.size()) {
            case 0:
                printOut += "no items";
                break;
            case 1:
                printOut += "1 item";
                break;
            default:
                printOut += items.size() + " items";
                break;
        }
 
        printOut += " (" + totalWeight + " kg)";

        return printOut;
    }

    public void printItems() {
        for (Item item: this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item item: this.items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviest = items.get(0);
        for (Item item: items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }

        return heaviest;
    }
}
