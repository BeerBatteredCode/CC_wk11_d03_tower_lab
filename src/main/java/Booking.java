public class Booking {

    private Room bedroom;
    private int numOfNights;
    private int price;

    public Booking(Room room, int numOfNights, int price){
        this.bedroom = room;
        this.numOfNights = numOfNights;
        this.price = price;
    }

    public int getNumOfNights(){
        return this.numOfNights;
    }

    public int getPrice(){
         return price;
    }

    public int getTotalCost(){
        return getNumOfNights() * getPrice();
    }

}
