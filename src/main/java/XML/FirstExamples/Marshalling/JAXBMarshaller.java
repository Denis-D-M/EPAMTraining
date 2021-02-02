package XML.FirstExamples.Marshalling;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class JAXBMarshaller {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        File personFile = new File("Person.xml");
//        JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
//        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//        Person person = (Person) unmarshaller.unmarshal(personFile);
//        System.out.println(person.getName());
//        System.out.println(person.getAge());
        JAXBContext context = JAXBContext.newInstance(Person.class);
        Marshaller marshaller = context.createMarshaller();
        Person p1 = new Person();
        p1.setName("Den");
        p1.setAge(40);
        marshaller.marshal(new Person(), new FileOutputStream(personFile));
    }
}
