package ie.atu.food_delivery_app.profileGeneration;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class BusinessProfileSuccessTest {

    private Business aBusiness;

    @BeforeEach
    void setup(){
        aBusiness = new Business("Dominos", "16 Prospect Hill", "091556100", 1200, 2300);
    }

    @Test
    void testNameSuccess(){
        assertEquals("Dominos", aBusiness.getBusinessName());
    }

    @Test
    void testAddressSuccess(){
        assertEquals("16 Prospect Hill", aBusiness.getBusinessAddress());
    }

    @Test
    void testAddressSuccess(){
        assertEquals("091556100", aBusiness.getBusinessPhoneNo());
    }

    @Test
    void testAddressSuccess(){
        assertEquals(1200, aBusiness.getBusinessOpenTime());
    }

    @Test
    void testAddressSuccess(){
        assertEquals(2300, aBusiness.getBusinessCloseTime());
    }
}
