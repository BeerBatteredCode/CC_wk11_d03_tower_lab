import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Room room;
    Guest guest;

    @Before
    public void before(){
        hotel = new Hotel("CC Towers");
        room = new Room("King Suite", 2, "Double");
        guest = new Guest("Rory MacGregor");
    }

    @Test
    public void checkGetHotelName(){
        assertEquals("CC Towers", hotel.getHotelName());
    }

    @Test
    public void checkAddRoomToHotel(){
        hotel.addRoomToHotel(room);
        assertEquals(1, hotel.countRooms());
    }

    @Test
    public void checkRemoveRoomFromHotel(){
        hotel.addRoomToHotel(room);
        hotel.addRoomToHotel(room);
        hotel.removeRoom();
        assertEquals(1, hotel.countRooms());
    }

    @Test
    public void checkCanCheckGuestIntoRoom(){
        hotel.addRoomToHotel(room);
        ArrayList<Guest> guestList = new ArrayList<>();
        guestList.add(guest);
        hotel.checkGuestIntoRoom(room.getRoomName(), guestList);
        assertEquals(1, room.getGuestCount());
    }
}
