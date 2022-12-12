package ie.atu.food_delivery_app.customer;

import ie.atu.food_delivery_app.business.Business;
import ie.atu.food_delivery_app.business.BusinessService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/customer")
public class CustomerController {
    CustomerService myService;

    public CustomerController(CustomerService myService) {
        this.myService = myService;
    }

    @GetMapping
    public List<Customer> getCustomers(){
        return myService.getCustomers();
    }

    @GetMapping("/eircode/{eircode}")
    public Customer getCustomerByEircode(@PathVariable("eircode") String eircode){
        return myService.getCustomerByEircode(eircode);
    }

    @PostMapping
    public void saveCustomerUser(@RequestBody Customer customerUser){
        myService.saveCustomerUser(customerUser);
    }
}
