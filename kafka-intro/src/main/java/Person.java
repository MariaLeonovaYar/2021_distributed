import java.util.ArrayList;
import java.util.Objects;

public class Person {

    public String lastName;
    public Integer age;
    public String firstName;
    public Integer number;
    public Address address;
    public ArrayList<String> phone;

    public Person(String lastName, Integer age, String firstName, Address address, ArrayList phone) {
        this.lastName = lastName;
        this.age = age;
        this.firstName = firstName;
        this.number = 0;
        this.address = address;
        this.phone = phone;
    }

    public Person() {
    }

    public ArrayList<String> getPhone() {
        return phone;
    }

    public void setPhone(ArrayList<String> phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}

