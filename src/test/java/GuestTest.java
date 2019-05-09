import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;


    @Before
    public void before(){
        guest = new Guest("Myriam Boran");
    }

    @Test
    public void checkGetGuestName(){
        assertEquals("Myriam Boran", guest.getGuestName());
    }
}
