package ie.atu.food_delivery_app.profileGeneration;

public class Business {
    private String businessName;
    private String businessAddress;
    private String businessPhoneNo;
    private int businessOpenTime;
    private int businessCloseTime;

    public Business(String businessName, String businessAddress, String businessPhoneNo, int businessOpenTime, int businessCloseTime) {
        this.businessName = businessName;
        this.businessAddress = businessAddress;
        this.businessPhoneNo = businessPhoneNo;
        this.businessOpenTime = businessOpenTime;
        this.businessCloseTime = businessCloseTime;
    }
}
