package ie.atu.food_delivery_app.customerJPA;

import ie.atu.food_delivery_app.customer.Customer;
import ie.atu.food_delivery_app.customer.CustomerRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertThat;

@SpringBootTest
class CustomerControllerTest {

    @Autowired
    private CustomerRepo customerRepo;


    @Test
    public void newCustomerTest() {
        Customer customer = new Customer();
        customer.setTitle("Mr");
        customer.setName("Patryk");
        customer.setPhone(1234567898);
        customer.setEircode("F34D212");
        customerRepo.save(customer);

        assertNotNull(customerRepo.findById(1L).get());
    }
}