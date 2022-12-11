package ie.atu.food_delivery_app.profileGeneration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class BusinessProfileFailTest {

    private Business aBusiness;

    @BeforeEach
    void setup(){
    }

    @Test
    void testNameFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () ->{new Business("McD", "16 Prospect Hill", "091556100", 1200, 2300);});
        assertEquals( "Business name must have at least 4 characters", exMessage.getMessage());
    }

    @Test
    void testAddressFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () ->{new Business("Dominos", "16 ", "091556100", 1200, 2300);});
        assertEquals( "Business address must have at least 8 characters", exMessage.getMessage());
    }

    @Test
    void testPhoneNoFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () ->{new Business("Dominos", "16 Prospect Hill", "09155", 1200, 2300);});
        assertEquals( "Business phone number must have at least 9 digits", exMessage.getMessage());
    }

    @Test
    void testOpenTimeFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () ->{new Business("Dominos", "16 Prospect Hill", "091556100", -1200, 2300);});
        assertEquals( "Business opening time must be a valid 24hr time", exMessage.getMessage());
    }

    @Test
    void testCloseTimeFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () ->{new Business("Dominos", "16 Prospect Hill", "091556100", 1200, 2700);});
        assertEquals( "Business closing time must be a valid 24hr time", exMessage.getMessage());
    }
}
