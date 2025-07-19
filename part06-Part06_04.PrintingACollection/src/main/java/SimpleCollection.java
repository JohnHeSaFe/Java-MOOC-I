
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        String printOutput = "The collection " + this.name + " ";

        if (elements.isEmpty()) {
            printOutput += "is empty.";
        } else if (elements.size() == 1) {
            printOutput += "has 1 element:\n";
        } else {
            printOutput += "has " + elements.size() + " elements:\n";
        }

        String letters = "";
        for (String element: elements) {
            letters += element;
            
            if (element != elements.get(elements.size() - 1)) {
                letters += "\n";
            };
        }

        return printOutput + letters;
    }
}
