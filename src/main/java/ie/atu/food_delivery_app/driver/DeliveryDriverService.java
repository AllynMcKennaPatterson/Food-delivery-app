package ie.atu.food_delivery_app.driver;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DeliveryDriverService {

    private final DeliveryDriverRepo deliveryDriverRepo;

    public List<DeliveryDriver> getDeliveryDrivers()
    {
        return deliveryDriverRepo.findAll();
    }

    /*public DeliveryDriver getDeliveryDriver(String driverID){
        DeliveryDriver myDeliveryDriverUsers = new DeliveryDriver("Mr", "Conor", "1111111111", "879543461", "2233445566", 21);
        return myDeliveryDriverUsers;
    }*/

    public void saveDeliveryDriverUser(DeliveryDriver deliveryDriverUser) {
        deliveryDriverRepo.save(deliveryDriverUser);
    }
}
