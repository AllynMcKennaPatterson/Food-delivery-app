package ie.atu.food_delivery_app.driver;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryDriverRepo extends JpaRepository<DeliveryDriver, Long> {

    DeliveryDriver getDeliveryDriver(String id);

    void deleteById(String id);
}
