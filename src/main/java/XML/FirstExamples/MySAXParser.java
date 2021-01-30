package XML.FirstExamples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class MySAXParser {
    public static Logger logger = LoggerFactory.getLogger(MySAXParser.class);
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        logger.error("ERRORRRRRRRRR");
        DefaultHandler handler = new DefaultHandler(){
            boolean firstName = false;
            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                if (qName.equals("firstName")){
                    firstName = true;
                }
            }


            @Override
            public void characters(char[] ch, int start, int length) throws SAXException {
                if (firstName){
                    System.out.println("Имя - " + new String(ch, start, length));
                    firstName = false;
                }
            }
        };
        parser.parse("newXML.xml", handler);
    }
}
