package XML.FirstExamples.Marshalling.ProMarshaller;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(Persons.class);
        Marshaller marshaller = context.createMarshaller();
        Persons persons = new Persons();
        persons.add(new Person("0", "Den", "Mishin", 20, new Person.Address("Russia", "Togliatti", "Frunze")));
        persons.add(new Person("1", "Anton", "Osokov", 21, new Person.Address("Russia", "Togliatti", "Primorskiy")));
        persons.add(new Person("2", "Misha", "Yudin", 22, new Person.Address("Russia", "Togliatti", "Sanatornaya")));
        persons.add(new Person("3", "Lena", "Ivanova", 19, new Person.Address("Russia", "Togliatti", "Naberezhnaya")));
        persons.add(new Person("4", "Igor", "Michailov", 23, new Person.Address("Russia", "Togliatti", "Beregovaya")));
        marshaller.marshal(persons, new FileOutputStream("personPro.xml"));
        Persons persons1 = (Persons) context.createUnmarshaller().unmarshal(new File("personPro.xml"));
        System.out.println(persons1);
    }
}
