package ie.atu.food_delivery_app.driver;

import ie.atu.food_delivery_app.customer.Customer;
import ie.atu.food_delivery_app.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/deliverydriver")
public class DeliveryDriverController {
    @Autowired
    DeliveryDriverService myService;

    public DeliveryDriverController(DeliveryDriverService myService) {
        this.myService = myService;
    }

    @GetMapping
    public List<DeliveryDriver> getDeliveryDriver(){
        return myService.getDeliveryDrivers();
    }

    @PostMapping
    public void saveDeliveryDriverUser(@RequestBody DeliveryDriver saveDeliveryDriverUser){
        myService.saveDeliveryDriverUser(saveDeliveryDriverUser);
    }

    /*@DeleteMapping("/deleteDriver/{driverCount}")
        public void deleteDeliveryDriver(@PathVariable("driverCount")Long driverCount){
            myService.deleteDeliveryDriver(driverCount);
        }*/
}
