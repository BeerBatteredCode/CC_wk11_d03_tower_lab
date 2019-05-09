import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room roomType;
    Guest guest;

    @Before
    public void before() {
        roomType = new Room("King Suite", 2, "Double");
        guest = new Guest("Grant Rutherford");
    }

    @Test
    public void checkGetRoomName() {
        assertEquals("King Suite", roomType.getRoomName());
    }

    @Test
    public void checkGetRoomCapacity() {
        assertEquals(2, roomType.getRoomCapacity());
    }
//
    @Test
    public void checkGetRoomType(){
        assertEquals("Double", roomType.getRoomType());
    }

    @Test
    public void checkGetGuestCount() {
        roomType.addGuestToRoom(guest);
        assertEquals(1, roomType.getGuestCount());

    }

    @Test
    public void checkAddGuestToRoom() {
        roomType.addGuestToRoom(guest);
        assertEquals(1, roomType.getGuestCount());
    }

    @Test
    public void checkAddGuestToRoomMaxTwo() {
        roomType.addGuestToRoom(guest);
        roomType.addGuestToRoom(guest);
        roomType.addGuestToRoom(guest);
        assertEquals(2, roomType.getGuestCount());
    }


    @Test
    public void checkRemoveGuestFromRoom() {
        roomType.addGuestToRoom(guest);
        roomType.addGuestToRoom(guest);
        roomType.addGuestToRoom(guest);
        roomType.removeGuestFromRoom();
        assertEquals(1, roomType.getGuestCount());
    }


}
