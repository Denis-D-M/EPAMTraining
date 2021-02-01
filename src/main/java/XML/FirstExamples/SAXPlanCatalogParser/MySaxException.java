package XML.FirstExamples.SAXPlanCatalogParser;

import org.xml.sax.SAXException;

public class MySaxException extends SAXException {
    public MySaxException(String message, Exception e){
        super(message, e);
    }
}
