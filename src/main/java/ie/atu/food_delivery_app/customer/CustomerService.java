package ie.atu.food_delivery_app.customer;

import ie.atu.food_delivery_app.business.Business;
import ie.atu.food_delivery_app.business.BusinessRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    public List<Customer> getCustomers()
    {
        return customerRepo.findAll();
    }

    public Customer getCustomerByEircode(String eircode){
        return customerRepo.getCustomerByEircode(eircode);
    }
    public void saveCustomerUser(Customer customerUser) {
        customerRepo.save(customerUser);
    }

    public void deleteCustomer(Long customerId){
        customerRepo.deleteById(customerId);
    }
}
