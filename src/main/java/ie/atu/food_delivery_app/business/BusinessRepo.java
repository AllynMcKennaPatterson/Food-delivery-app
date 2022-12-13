package ie.atu.food_delivery_app.business;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessRepo extends JpaRepository<Business, Long> {
   // Business getBusinessByName(String businessName);
}
