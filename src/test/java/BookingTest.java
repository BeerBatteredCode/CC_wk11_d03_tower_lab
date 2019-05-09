import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    Booking booking;
    Room bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Room("King suite", 2, "Double");
        booking = new Booking(bedroom, 4, 30);
        guest = new Guest("Kenny McDonald");
    }

    @Test
    public void checkGetNumberOfNights(){
        assertEquals(4, booking.getNumOfNights());
//        assertEquals(bedroom, booking.getBookedRoom());
    }


    @Test
    public void checkGetPrice(){
        assertEquals(120, booking.getTotalCost());
    }

    @Test
    public void checkBookingComplete(){
        bedroom.addGuestToRoom(guest);
        bedroom.addGuestToRoom(guest);
        bedroom.addGuestToRoom(guest);
        assertEquals(2, bedroom.getGuestCount());
        assertEquals(120, booking.getTotalCost());
    }

//    @Test
//    public void checkGetFinalBill(){
//        assertEquals(30, booking.getFinalBill());
//    }

}
