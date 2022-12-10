package ie.atu.food_delivery_app;

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
}

