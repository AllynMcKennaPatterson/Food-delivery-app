package ie.atu.food_delivery_app.driver;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Driver;
import java.util.List;

@AllArgsConstructor
@Service
public class DeliveryDriverService {

    private final DeliveryDriverRepo deliveryDriverRepo;

    public List<DeliveryDriver> getDeliveryDrivers()
    {
        return deliveryDriverRepo.findAll();
    }

    public DeliveryDriver getDeliveryDriver(String ID){
        return deliveryDriverRepo.getDeliveryDriver(ID);
    }

    public void saveDeliveryDriverUser(DeliveryDriver deliveryDriverUser) {
        deliveryDriverRepo.save(deliveryDriverUser);
    }

    public void deleteDeliveryDriver(String ID){
        deliveryDriverRepo.deleteById(ID);
    }
}
