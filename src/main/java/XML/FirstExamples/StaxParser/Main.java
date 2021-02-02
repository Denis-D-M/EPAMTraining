package XML.FirstExamples.StaxParser;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        StaxParser staxParser = new StaxParser();
        Catalog catalog = null;
        try {
            catalog = staxParser.parseXML("plan_catalog.xml");
        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }

        StaxWriter staxWriter = new StaxWriter();
        try {
            staxWriter.writeList(catalog.getList(), "result.xml");
        } catch (IOException | XMLStreamException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }


}
