package ie.atu.food_delivery_app.customer;

import ie.atu.food_delivery_app.business.Business;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
