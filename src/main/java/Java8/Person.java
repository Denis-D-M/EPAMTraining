package Java8;

import java.util.Optional;

public class Person {

    private String firstName;

    private String secondName;

    private Integer age;

    private PersonAddress address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName =secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public PersonAddress getAddress() {
        return address;
    }

    public void setAddress(PersonAddress address) {
        this.address = address;
    }
}
class PersonAddress {
    AddressStreet addressStreet;

    public AddressStreet getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(AddressStreet addressStreet) {
        this.addressStreet = addressStreet;
    }
}
class AddressStreet {
    String street;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}