package XML.FirstExamples.StaxParser;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StaxParser {
     private XMLStreamReader streamReader;

    private void createParser(String path) throws FileNotFoundException, XMLStreamException {
        streamReader =  XMLInputFactory.newFactory().createXMLStreamReader(new FileInputStream(path));
    }

    public Catalog parseXML(String path) throws XMLStreamException, FileNotFoundException {
        createParser(path);
        Catalog catalog = new Catalog();
        Plant tmpPlant = null;
        while (streamReader.hasNext()){
            streamReader.next();
            if (streamReader.isStartElement()){
                switch (streamReader.getLocalName()){
                    case "PLANT" -> tmpPlant = new Plant();
                    case "COMMON" -> {
                        streamReader.next();
                        tmpPlant.setCommon(streamReader.getText());
                    }
                    case "BOTANICAL" -> {
                        streamReader.next();
                        tmpPlant.setBotanical(streamReader.getText());
                    }
                    case "ZONE" -> {
                        streamReader.next();
                        tmpPlant.setZone(streamReader.getText());
                    }
                    case "LIGHT" -> {
                        streamReader.next();
                        tmpPlant.setLight(streamReader.getText());
                    }
                    case "PRICE" -> {
                        streamReader.next();
                        tmpPlant.setPrice(streamReader.getText());
                    }
                    case "AVAILABILITY" -> {
                        streamReader.next();
                        tmpPlant.setAvailability(Integer.parseInt(streamReader.getText()));
                    }
                }
            } else if (streamReader.isEndElement() && streamReader.getLocalName().equals("PLANT")){
                catalog.add(tmpPlant);
            }
        }
        return catalog;
    }
}
