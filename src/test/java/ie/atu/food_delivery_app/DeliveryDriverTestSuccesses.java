package ie.atu.food_delivery_app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeliveryDriverTestSuccesses {
    //Test
    DeliveryDriver MyDriver;

    @BeforeEach
    void setUp() {
    }

    @Test
    void success_test_Title() {
        DeliveryDriver MyDriver = new DeliveryDriver("Mr", "Conor", "1111111111", "879543461", "2233445566", 21);
        assertEquals("Mr", MyDriver.getTitle());
    }

    @Test
    void success_test_Title_Mrs() {
        DeliveryDriver MyDriver = new DeliveryDriver("Mrs", "Conor", "1111111111", "879543461", "2233445566", 21);
        assertEquals("Mrs", MyDriver.getTitle());
    }

    @Test
    void success_test_Title_Ms() {
        DeliveryDriver MyDriver = new DeliveryDriver("Mr", "Conor", "1111111111", "879543461", "2233445566", 21);
        assertEquals("Ms", MyDriver.getTitle());
    }

    @Test
    void test_success_name_check() {
        DeliveryDriver myDriver = new DeliveryDriver("Mr", "Conor", "1111111111", "879543461", "2233445566", 21);
        assertEquals("Conor", myDriver.getName());
    }

    @Test
    void test_success_ID_check() {
        DeliveryDriver myDriver = new DeliveryDriver("Mr", "Conor", "1111111111", "879543461", "2233445566", 21);
        assertEquals("1111111111", myDriver.getID());
    }

    @Test
    void test_success_CarReg_check() {
        DeliveryDriver myDriver = new DeliveryDriver("Mr", "Conor", "1111111111", "879543461", "2233445566", 21);
        assertEquals("879543461", myDriver.getCarReg());
    }

    @Test
    void test_success_LicenceNo_check() {
        DeliveryDriver myDriver = new DeliveryDriver("Mr", "Conor", "1111111111", "879543461", "2233445566", 21);
        assertEquals("2233445566", myDriver.getLicenceNo());
    }
}
