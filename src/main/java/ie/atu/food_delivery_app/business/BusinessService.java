package ie.atu.food_delivery_app.business;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@AllArgsConstructor
@Service
public class BusinessService {

    private final BusinessRepo businessRepo;

    public List<Business> getBusinesses()
    {
        return businessRepo.findAll();
    }

    public Business getBusinesses(String businessID){
        Business myBusinessUsers = new Business("Dominos", "16 Prospect Hill", "091556100", 1200, 2300);
        return myBusinessUsers;
    }
    public void saveBusinessUser(Business businessUser) {
        businessRepo.save(businessUser);
    }
}
