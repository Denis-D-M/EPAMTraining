package XML.FirstExamples.SAXPlanCatalogParser;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserHandler extends DefaultHandler {
    private final Catalog catalog = new Catalog();
    private boolean isPlant = false;
    private String currentTag;
    private final Plant plant = new Plant();

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        currentTag = qName;
        if (currentTag.equals("PLANT")) {
            isPlant = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equals("PLANT")) {
            isPlant = false;
            catalog.add(plant);
        }
        currentTag = null;
    }

    // Вызывается во время startElement и endElement??????
    @Override
    public void characters(char[] ch, int start, int length) {
        if (!isPlant || currentTag == null) {
            return;
        }
        String tmp = new String(ch, start, length);
        switch (currentTag) {
            case "COMMON" -> plant.setCommon(tmp);
            case "BOTANICAL" -> plant.setBotanical(tmp);
            case "ZONE" -> plant.setZone(tmp);
            case "LIGHT" -> plant.setLight(tmp);
            case "PRICE" -> plant.setPrice(tmp);
            case "AVAILABILITY" -> plant.setAvailability(Integer.parseInt(tmp));
        }
    }

    public Catalog getCatalog() {
        return catalog;
    }
}
