package XML.FirstExamples.StaxParser;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

public class StaxWriter {
    XMLStreamWriter xmlStreamWriter;

    private void createWriter(String path) throws IOException, XMLStreamException {
        this.xmlStreamWriter = XMLOutputFactory.newFactory().createXMLStreamWriter(new FileWriter(path));
    }

    public <T> void writeList(List<T> list, String path) throws XMLStreamException, IOException, IllegalAccessException {
        this.createWriter(path);
        xmlStreamWriter.writeStartDocument("1.0");
        xmlStreamWriter.writeStartElement("catalog");
        if (list.isEmpty()) {
            xmlStreamWriter.writeEndElement();
            this.close();
            System.err.println("Лист пустой");
            return;
        }

        for (T t : list) {
            xmlStreamWriter.writeStartElement(list.get(0).getClass().getSimpleName());
            Field[] fields = list.get(0).getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                xmlStreamWriter.writeStartElement(field.getName());
                xmlStreamWriter.writeCharacters(field.get(t).toString());
                xmlStreamWriter.writeEndElement();
            }
            xmlStreamWriter.writeEndElement();
        }
        xmlStreamWriter.writeEndElement();
        this.close();
    }

    private void close() throws XMLStreamException {
        xmlStreamWriter.flush();
        xmlStreamWriter.close();
    }

}
