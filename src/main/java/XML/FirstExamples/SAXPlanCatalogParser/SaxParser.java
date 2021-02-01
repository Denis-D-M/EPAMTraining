package XML.FirstExamples.SAXPlanCatalogParser;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SaxParser {
    public Catalog parse(){
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SaxParserHandler handler = new SaxParserHandler();
        SAXParser parser = null;
        try {
            parser = factory.newSAXParser();
        } catch (Exception e) {
            System.err.println("Open sax parcer error" + e.toString());
            return null;
        }
        File file = new File("plan_catalog.xml");
        try {
            parser.parse(file, handler);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return handler.getCatalog();
    }


}
