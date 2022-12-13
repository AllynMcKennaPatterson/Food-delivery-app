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

    @GetMapping("/driverid/{ID}")
    public DeliveryDriver getDeliveryDriver(@PathVariable("ID") String ID){
        return myService.getDeliveryDriver(ID);
    }

    @PostMapping
    public void saveDeliveryDriverUser(@RequestBody DeliveryDriver saveDeliveryDriverUser){
        myService.saveDeliveryDriverUser(saveDeliveryDriverUser);
    }

    @DeleteMapping("/deleteDriver/{ID}")
        public void deleteDeliveryDriver(@PathVariable("ID")String ID){
            myService.deleteDeliveryDriver(ID);
        }
}
