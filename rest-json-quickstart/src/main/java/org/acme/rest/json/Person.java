package org.acme.rest.json;

public class Person {

    public String firstName;
    public String lastName;
    public int age;

    public Person() {
    }

    public Person(String fistName, String lastName, int age) {
        this.firstName = fistName;
        this.lastName = lastName;
        this.age = age;
    }

}
