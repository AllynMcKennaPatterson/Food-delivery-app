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

    /*public Business getBusinessesByName(String businessName){
        return businessRepo.getBusinessByName(businessName);
    }*/
    public void saveBusiness(Business businessUser) {
        businessRepo.save(businessUser);
    }

    /*public void deleteBusiness(Long businessCount){
        businessRepo.deleteById(businessCount);
    }*/
}
