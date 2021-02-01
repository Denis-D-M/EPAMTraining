package XML.FirstExamples.SAXPlanCatalogParser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserHandler extends DefaultHandler {
    private Catalog catalog = new Catalog();
    private boolean isPlant = false;
    private String currentTag;
    private Plant plant = new Plant();

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentTag = qName;
        if (currentTag.equals("PLANT")) {
            isPlant = true;
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("PLANT")) {
            isPlant = false;
            catalog.add(plant);
        }
       
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (!isPlant) {
            return;
        }
        String tmp = new String(ch, start, length);
        switch (currentTag) {
            case "COMMON" -> System.out.println(currentTag + " " + tmp);
            case "BOTANICAL" -> System.out.println(currentTag + " " + tmp);
            case "ZONE" -> System.out.println(currentTag + " " + tmp);
            case "LIGHT" -> System.out.println(currentTag + " " + tmp);
            case "PRICE" -> System.out.println(currentTag + " " + tmp);
            case "AVAILABILITY" -> System.out.println(currentTag + " " + tmp);
        }

//        switch (currentTag) {
//            case "COMMON" -> plant.setCommon(tmp);
//            case "BOTANICAL" -> plant.setBotanical(tmp);
//            case "ZONE" -> plant.setZone(tmp);
//            case "LIGHT" -> plant.setLight(tmp);
//            case "PRICE" -> plant.setPrice(tmp);
//            case "AVAILABILITY" -> plant.setAvailability(Integer.parseInt(tmp));
//        }
    }

    public Catalog getCatalog() {
        return catalog;
    }
}
