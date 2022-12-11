package ie.atu.food_delivery_app.JPA;

import ie.atu.food_delivery_app.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
    Customer findCustomerByName(String name);
}
