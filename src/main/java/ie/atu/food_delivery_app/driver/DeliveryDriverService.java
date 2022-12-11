package ie.atu.food_delivery_app.driver;

import ie.atu.food_delivery_app.customer.Customer;
import ie.atu.food_delivery_app.customer.CustomerRepo;
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
}
