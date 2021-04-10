package org.acme.rest.json;

public class Person {

    public String firstName;
    public String lastName;
    public int age;
    public Address address;

    public Person() {
    }

    public Person(String fistName, String lastName, int age, Address adress) {
        this.firstName = fistName;
        this.lastName = lastName;
        this.age = age;
        this.address = adress;
    }

}
