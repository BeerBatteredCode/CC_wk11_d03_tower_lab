import java.util.ArrayList;

public class Room {

    private String name;
    private int capacity;
    private String type;
//    private HashMap<String, Integer> roomType;
    private ArrayList<Guest> guestCount;

    public Room(String name, int capacity, String type){
        this.name = name;
        this.capacity = capacity;
        this.type = type;
        this.guestCount = new ArrayList<>();
    }

    public String getRoomName(){
        return name;
    }

    public int getRoomCapacity(){
        return capacity;
    }

    public String getRoomType(){
        return type;
    }

    public int getGuestCount() {
        return this.guestCount.size();
    }

    public void addGuestToRoom(Guest guest){
        if (getGuestCount() < capacity){
            this.guestCount.add(guest);
        }
        return;
    }

    public void removeGuestFromRoom() {
        this.guestCount.remove(0);
    }


//    public String getRoomType(){
//
//    }


}
