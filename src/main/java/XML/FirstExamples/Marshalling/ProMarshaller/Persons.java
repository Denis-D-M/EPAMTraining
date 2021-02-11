package XML.FirstExamples.Marshalling.ProMarshaller;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Persons {

    @XmlElement(name = "person")
    private List<Person> personList = new ArrayList<>();

    public Persons(){}
    public void add(Person p){
        personList.add(p);
    }

    @Override
    public String toString() {
        return "Persons{" +
                "personList=" + personList +
                '}';
    }
}

