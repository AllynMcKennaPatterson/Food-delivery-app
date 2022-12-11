package ie.atu.food_delivery_app.JPA;

import ie.atu.food_delivery_app.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    public List<Customer> getCustomers() {
        return customerRepo.findAll();
    }

    public void saveCustomer(Customer customer){customerRepo.save(customer);}

    public Customer findCustomerByName(String name) {
        return customerRepo.findCustomerByName(name);
    }
}
