package ie.atu.food_delivery_app.driver;

import ie.atu.food_delivery_app.customer.Customer;
import ie.atu.food_delivery_app.customer.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/deliverydriver")
public class DeliveryDriverController {
    DeliveryDriverService myService;

    public DeliveryDriverController(DeliveryDriverService myService) {
        this.myService = myService;
    }

    @GetMapping
    public List<DeliveryDriver> getDeliveryDriver(){
        return myService.getDeliveryDrivers();
    }

   /* @GetMapping("/{driverID}")
    public DeliveryDriver getDeliveryDriver(@PathVariable String driverID){
        return myService.getDeliveryDriver(driverID);
    }*/

    @PostMapping
    public void saveDeliveryDriverUser(@RequestBody DeliveryDriver saveDeliveryDriverUser){
        myService.saveDeliveryDriverUser(saveDeliveryDriverUser);
    }
}
