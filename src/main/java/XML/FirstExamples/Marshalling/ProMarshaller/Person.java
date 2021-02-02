package XML.FirstExamples.Marshalling.ProMarshaller;

import jakarta.xml.bind.annotation.*;

@XmlRootElement
@XmlType(name = "person", propOrder = {
        "name",
        "surname",
        "age",
        "address"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    @XmlAttribute (required = true)
    @XmlID
    private String id;
    @XmlElement (required = true)
    private String name;
    @XmlElement
    private String surname;
    @XmlElement
    private int age;
    @XmlElement
    private Address address;
    @XmlRootElement
    @XmlType(name = "address", propOrder = {
            "city",
            "country",
            "street"})
    public static class Address {
        private String country;
        private String city;
        private String street;

        public Address(String country, String city, String street) {
            this.country = country;
            this.city = city;
            this.street = street;
        }
        public Address() {}

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "country='" + country + '\'' +
                    ", city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    '}';
        }
    }
    public Person(){}

    public Person(String id, String name, String surname, int age, Address address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
