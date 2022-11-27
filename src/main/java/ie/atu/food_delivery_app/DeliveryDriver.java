package ie.atu.food_delivery_app;

public class DeliveryDriver {
    private String Title;
    private String Name;
    private String ID;
    private String CarReg;
    private String LicenceNumber;
    private int Age;

    public void setTitle(String title) {

        if(("Mr").equalsIgnoreCase(title) || ("Mrs").equalsIgnoreCase(title) || ("Ms").equalsIgnoreCase(title)) {
            Title = title;
        }
        else {
            throw new IllegalArgumentException("Please enter Mr, Mrs or Ms");
        }

    }

    public String getTitle() {
        return Title;
    }

}
