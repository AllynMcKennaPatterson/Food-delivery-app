package ie.atu.food_delivery_app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeliveryDriverTestFails {
    @BeforeEach
    void setUp() {
    }

    @Test
    void testTitleFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new DeliveryDriver("Mister", "Conor", "1111111111", "879543461", "2233445566", 21));
        assertEquals("Please enter Mr, Mrs or Ms", exMessage.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}
