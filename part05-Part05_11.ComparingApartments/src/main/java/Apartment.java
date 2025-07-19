
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;
    private int price;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
        this.price = pricePerSquare * squares;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        if (this.moreExpensiveThan(compared)) {
            return this.price - compared.price;
        } else {
            return compared.price - this.price;
        }

    }

    public boolean moreExpensiveThan(Apartment compared) {
        return this.price > compared.price;
    }
}
