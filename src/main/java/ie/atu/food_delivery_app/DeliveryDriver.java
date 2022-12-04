package ie.atu.food_delivery_app;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

public class DeliveryDriver {
    private String Title;
    private String Name;
    private String ID;
    private String CarReg;
    private String LicenceNo;
    private int Age;

    public void setTitle(String title) {

        if(("Mr").equalsIgnoreCase(title) || ("Mrs").equalsIgnoreCase(title) || ("Ms").equalsIgnoreCase(title)) {
            Title = title;
        }
        else {
            throw new IllegalArgumentException("Please enter Mr, Mrs or Ms");
        }

    }

    public void setName(String name) {
        int count = name.length();
        if (count >= 3) {
            Name = name;
        }
        else {
            throw new IllegalArgumentException("Name must be greater than 3 characters long");
        }

    }

    public void setID(String id) {
        int count = id.length();
        if (count >= 10) {
            ID = id;
        }
        else {
            throw new IllegalArgumentException("ID must be greater than 10 characters long");
        }

    }

    public void setCarReg(String carReg) {
        int count = carReg.length();
        if (count >= 4) {
            CarReg = carReg;
        }
        else {
            throw new IllegalArgumentException("Car registration must be greater than 4 characters long, do not enter - in your entry");
        }

    }

    public void setLicenceNo(String licenseNo) {
        int count = licenseNo.length();
        if (count >= 8) {
            LicenceNo = licenseNo;
        }
        else {
            throw new IllegalArgumentException("Your licence must be greater than 8 characters long");
        }

    }

    public void setAge(int age) {
        if (age > 18) {
            Age = age;
        }
        else {
            throw new IllegalArgumentException("You must be over the age of 18 to be a food delivery driver with us, sorry");
        }

    }


    public String getTitle() {
        return Title;
    }

 //test
}
