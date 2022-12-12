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

    @GetMapping("/{customerID}")
    public Customer getCustomers(@PathVariable String customerID){
        return myService.getCustomers(customerID);
    }

    @PostMapping
    public void saveCustomerUser(@RequestBody Customer customerUser){
        myService.saveCustomerUser(customerUser);
    }
}
