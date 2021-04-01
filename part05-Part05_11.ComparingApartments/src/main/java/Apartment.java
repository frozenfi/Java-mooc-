
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared) {
        if(this.squares > compared.squares) {
            return true;
        } else 
            return false;
    }
    
    public int priceDifference(Apartment compared) {
        int price = this.pricePerSquare*this.squares;
        int priceToComp =compared.pricePerSquare  * compared.squares;
        int priceDiff = Math.abs(price - priceToComp);
        
        return priceDiff;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int price = this.pricePerSquare*this.squares;
        int priceToComp =compared.pricePerSquare  * compared.squares;
        if(price > priceToComp) {
            return true;
        } else 
            return false;
    }

}
