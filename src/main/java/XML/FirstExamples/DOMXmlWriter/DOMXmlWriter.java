package XML.FirstExamples.DOMXmlWriter;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class DOMXmlWriter {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Denis", 20));
        list.add(new Person("Anton", 22));
        list.add(new Person("Misha", 19));
        list.add(new Person("Sergey", 23));
        list.add(new Person("Larisa", 21));
        list.add(new Person("Dmitriy", 20));
        
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Bobik", 4, true));
        dogs.add(new Dog("Sharik", 4, true));
        dogs.add(new Dog("Pushok", 4, false));
        dogs.add(new Dog("Baltazar", 4, true));
        dogs.add(new Dog("Carl", 4, false));

        DOMXmlWriter xmlWriter = new DOMXmlWriter();
        Document document = null;
        try {
            document = xmlWriter.createDocument();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        // Что ещё за assert он предлагает? Впервые с ним сталкиваюсь 0_0
        try {
            assert document != null;
            xmlWriter.writeList(document, list);
//            xmlWriter.writeList(document, dogs);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            xmlWriter.closeWriter(document);
        } catch (TransformerException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public Document createDocument() throws ParserConfigurationException {
        return DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
    }

    public <T> void writeList(Document document, List<T> list) throws IllegalAccessException {
        Element root = document.createElement("root");
        document.appendChild(root);
        Field[] personFields = list.get(0).getClass().getDeclaredFields();
        for (T t : list) {
            Element elem = document.createElement(t.getClass().getSimpleName().toLowerCase());
            root.appendChild(elem);
            for (Field field : personFields) {
                field.setAccessible(true);
                Element ElemI = document.createElement(field.getName());
                ElemI.setTextContent(field.get(t).toString());
                elem.appendChild(ElemI);
            }
        }
    }

    public void closeWriter(Document document) throws TransformerException, FileNotFoundException {
        Transformer t = TransformerFactory.newInstance().newTransformer();
        t.setOutputProperty(OutputKeys.INDENT, "yes");
        t.transform(new DOMSource(document), new StreamResult(new FileOutputStream("temp.xml")));
    }
}
