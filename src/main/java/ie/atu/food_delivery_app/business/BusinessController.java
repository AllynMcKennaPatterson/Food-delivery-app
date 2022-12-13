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
    public List<Business> getBusinessesByName(){
        return myService.getBusinesses();
    }

    /*@GetMapping("/business/{businessName}")
    public Business getBusinessesByName(@PathVariable String businessName){
        return myService.getBusinessesByName(businessName);
    }*/

    @PostMapping("")
    public void saveBusinessUser(@RequestBody Business business){
        myService.saveBusiness(business);
    }

    /*@DeleteMapping("/delete/{businessCount}")
    public void deletePassenger(@PathVariable("businessCount")Long businessCount){
        myService.deleteBusiness(businessCount);
    }*/
}
