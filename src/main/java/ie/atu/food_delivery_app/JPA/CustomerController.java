package ie.atu.food_delivery_app.JPA;

import ie.atu.food_delivery_app.Customer;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "api/customer")
public class CustomerController {

    CustomerService myService;

    public CustomerController(CustomerService myService){
        this.myService = myService;
    }

    @GetMapping
    public List<Customer> getCustomer(){return myService.getCustomers();}

    @PostMapping("")
    public void saveCustomer(@RequestBody Customer customer){myService.saveCustomer(customer);}

    @GetMapping("/name/{name}")
    public Customer getCustomerName(@PathVariable("name")String name){return myService.findCustomerByName(name);}
}

