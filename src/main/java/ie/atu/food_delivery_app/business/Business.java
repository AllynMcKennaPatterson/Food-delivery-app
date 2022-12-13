package ie.atu.food_delivery_app.business;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Business {
    private String businessName;
    private String businessAddress;
    private String businessPhoneNo;
    private int businessOpenTime;
    private int businessCloseTime;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long businessCount;

    public Business(String businessName, String businessAddress, String businessPhoneNo, int businessOpenTime, int businessCloseTime) {
        setBusinessName(businessName);
        setBusinessAddress(businessAddress);
        setBusinessPhoneNo(businessPhoneNo);
        setBusinessOpenTime(businessOpenTime);
        setBusinessCloseTime(businessCloseTime);
    }

    public void setBusinessName(String businessName){
        if(businessName.length() >= 4){
            this.businessName = businessName;
        }
        else{
            throw new IllegalArgumentException("Business name must have at least 4 characters");
        }
    }

    public void setBusinessAddress(String businessAddress){
        if(businessAddress.length() >= 8){
            this.businessAddress = businessAddress;
        }
        else{
            throw new IllegalArgumentException("Business address must have at least 8 characters");
        }
    }

    public void setBusinessPhoneNo(String businessPhoneNo){
        if(businessPhoneNo.length() >= 9){
            this.businessPhoneNo = businessPhoneNo;
        }
        else{
            throw new IllegalArgumentException("Business phone number must have at least 9 digits");
        }
    }

    public void setBusinessOpenTime(int businessOpenTime){
        if(businessOpenTime >= 0 && businessOpenTime <= 2359){
            this.businessOpenTime = businessOpenTime;
        }
        else{
            throw new IllegalArgumentException("Business opening time must be a valid 24hr time");
        }
    }

    public void setBusinessCloseTime(int businessCloseTime){
        if(businessCloseTime >= 0 && businessCloseTime <= 2359){
            this.businessCloseTime = businessCloseTime;
        }
        else{
            throw new IllegalArgumentException("Business closing time must be a valid 24hr time");
        }
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public String getBusinessPhoneNo() {
        return businessPhoneNo;
    }

    public int getBusinessOpenTime() {
        return businessOpenTime;
    }

    public int getBusinessCloseTime() {
        return businessCloseTime;
    }
}
