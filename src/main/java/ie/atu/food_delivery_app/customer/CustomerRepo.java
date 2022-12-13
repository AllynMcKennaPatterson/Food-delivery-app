package ie.atu.food_delivery_app.customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
    Customer getCustomerByEircode(String eircode);
}
