package ie.atu.food_delivery_app.business;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path="api/business")
public class BusinessController {
    BusinessService myService;

    public BusinessController(BusinessService myService) {
        this.myService = myService;
    }

    @GetMapping
    public List<Business> getBusinesses(){
        return myService.getBusinesses();
    }

    @GetMapping("/{businessID}")
    public Business getBusinesses(@PathVariable String businessID){
        return myService.getBusinesses(businessID);
    }

    @PostMapping
    public void saveBusinessUser(@RequestBody Business businessUser){
        myService.saveBusinessUser(businessUser);
    }
}
