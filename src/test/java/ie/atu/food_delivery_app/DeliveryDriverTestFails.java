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
    void testTitleFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {
            new DeliveryDriver("Mister", "Conor", "1111111111", "879543461", "2233445566", 21);
        });
        assertEquals("Please enter Mr, Mrs or Ms", exMessage.getMessage());
    }

    @Test
    void testNameFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {
            new DeliveryDriver("Mr", "Oj", "1111111111", "879543461", "2233445566", 21);
        });
        assertEquals("Name must be greater than 3 characters long", exMessage.getMessage());
    }

    @Test
    void test_fail_Age_check() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {
            new DeliveryDriver("Mr", "Conor", "1111111111", "879543461","2233445566", 15);});
        assertEquals("You must be over the age of 18 to be a food delivery driver with us, sorry", exMessage.getMessage());
    }

}
