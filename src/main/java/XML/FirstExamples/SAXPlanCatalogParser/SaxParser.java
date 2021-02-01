package XML.FirstExamples.SAXPlanCatalogParser;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class SaxParser {
    public Catalog parse(String path) throws MySaxException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SaxParserHandler handler = new SaxParserHandler();
        SAXParser parser;
        try {
            parser = factory.newSAXParser();
        } catch (ParserConfigurationException | SAXException e) {
            throw new MySaxException("Не получилось создать SAX парсер", e);
        }
        File file = new File(path);
        try {
            parser.parse(file, handler);
        } catch (SAXException | IOException e) {
            throw new MySaxException("Ошибка в работе SAX парсера", e);
        }
        return handler.getCatalog();
    }


}
