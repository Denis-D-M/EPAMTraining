package Lection3_Collections;

import java.util.Objects;

public class Human {
    private String fullName;
    private int age;
    Adress adress;

    public Human(String fullName, int age, String city, String street, short building, short apartment ) {
        this.fullName = fullName;
        this.age = age;
        this.adress = new Adress(city,street,building,apartment);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(fullName, human.fullName) && Objects.equals(adress, human.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, age, adress);
    }

    @Override
    public String toString() {
        return "Human{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", adress=" + adress +
                '}';
    }

    private class Adress {
        private String city;
        private String street;
        private short building;
        private short apartment;

        public Adress(String city, String street, short building, short apartment) {
            this.city = city;
            this.street = street;
            this.building = building;
            this.apartment = apartment;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Adress adress = (Adress) o;
            return building == adress.building && apartment == adress.apartment && Objects.equals(city, adress.city) && Objects.equals(street, adress.street);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, street, building, apartment);
        }
    }
}
