import java.util.ArrayList;

public class Person {
   public String firstName;
   public String lastName;
   public int age;
   public Address address;
   public ArrayList<String> phone;

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Person simpson = (Person) obj;
        return this.firstName.equals(simpson.firstName) &&
               this.lastName.equals(simpson.lastName)  &&
               this.age == simpson.age &&
               this.address.streetAddress.equals(simpson.address.streetAddress) &&
               this.address.postalCode.equals(simpson.address.postalCode) &&
               this.address.city.equals(simpson.address.city) &&
               this.phone.equals(simpson.phone);
    }

    Person(){
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.address = new Address("", "", "");
        this.phone = new ArrayList<>();
    }

    Person(String firstName, String lastName, int age, Address address, ArrayList phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }
}

