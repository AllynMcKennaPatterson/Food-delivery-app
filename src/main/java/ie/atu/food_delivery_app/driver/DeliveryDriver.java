package ie.atu.food_delivery_app.driver;

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

public class DeliveryDriver {
    private String ID;
    private String Title;
    private String Name;
    private String CarReg;
    private String LicenceNo;
    private int Age;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long driverCount;


    public DeliveryDriver(String title, String name, String id, String carReg, String licenceNo, int age) {
        setTitle(title);
        setName(name);
        setID(id);
        setCarReg(carReg);
        setLicenceNo(licenceNo);
        setAge(age);
    }
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
            throw new IllegalArgumentException("Car registration must be greater than 4 characters long, do not enter - in your entry, for example 01G2345");
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

    public String getName() {
        return Name;
    }

    public String getID() {
        return ID;
    }

    public String getCarReg() {
        return CarReg;
    }

    public String getLicenceNo() {
        return LicenceNo;
    }

    public int getAge() {
        return Age;
    }
}
