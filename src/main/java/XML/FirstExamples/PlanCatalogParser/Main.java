package XML.FirstExamples.PlanCatalogParser;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        Document document = getDocument("plan_catalog.xml");
        Catalog catalog = parsePlants(document);
        System.out.println(catalog);
    }

    public static Document getDocument(String path) throws IOException, SAXException, ParserConfigurationException {
        File file = new File(path);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        return documentBuilder.parse(file);
    }

    public static Catalog parsePlants(Document document) {
        NodeList nodeList = document.getFirstChild().getChildNodes();
        Catalog catalog = new Catalog();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node element = nodeList.item(i);
            if (element.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            catalog.add(parsePlant(nodeList.item(i)));
        }
        return catalog;
    }

    public static Plant parsePlant(Node plant) {
        NodeList elementsOfPlant = plant.getChildNodes();
        String common = "";
        String botanical = "";
        String zone = "";
        String light = "";
        String price = "";
        int availability = 0;
        for (int i = 0; i < elementsOfPlant.getLength(); i++) {
            Node plantNode = elementsOfPlant.item(i);
            if (plantNode.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            switch (plantNode.getNodeName()) {
                case "COMMON" -> common = plantNode.getTextContent();
                case "BOTANICAL" -> botanical = plantNode.getTextContent();
                case "ZONE" -> zone = plantNode.getTextContent();
                case "LIGHT" -> light = plantNode.getTextContent();
                case "PRICE" -> price = plantNode.getTextContent();
                case "AVAILABILITY" -> availability = Integer.parseInt(plantNode.getTextContent());
            }

        }
        return new Plant(common, botanical, zone, light, price, availability);
    }
}
