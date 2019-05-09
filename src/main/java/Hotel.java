import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Room> roomCollection;


    public Hotel(String  name){
        this.roomCollection = new ArrayList<>();
        this.name = name;

    }

    public String getHotelName() {
        return name;
    }


    public int countRooms() {
        return roomCollection.size();
    }

    public void addRoomToHotel(Room room) {
        this.roomCollection.add(room);

    }

    public void removeRoom() {
        this.roomCollection.remove(0);
    }


    public void checkGuestIntoRoom(String roomName, ArrayList<Guest> guestList) {
        Room room = findRoom(roomName);
        if (room != null){
            for (Guest guest : guestList){
                room.addGuestToRoom(guest);
            }
        }
    }

    public Room findRoom(String name){
        Room foundRoom = null;
        for (Room room : this.roomCollection){
            if (room.getRoomName() == name){
                foundRoom = room;
            }
        }
        return foundRoom;
    }
}
