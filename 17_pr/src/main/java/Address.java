public class Address {
    public String streetAddress;
    public String city;
    public String postalCode;

    Address(){
        this.streetAddress = "";
        this.city = "";
        this.postalCode = "";
    }

    Address(String streetAddress, String city, String postalCode){
        this.streetAddress = streetAddress;
        this.city = city;
        this.postalCode = postalCode;
    }
}
