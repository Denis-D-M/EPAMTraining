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
        File file = new File("plan_catalog.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document document = documentBuilder.parse(file);
        NodeList nodeList = document.getFirstChild().getChildNodes();
        Catalog catalog = new Catalog();
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            String common = "";
            String botanical = "";
            String zone = "";
            String light = "";
            String price = "";
            int availability = 0;
            NodeList plants = nodeList.item(i).getChildNodes();
            for (int j = 0; j < plants.getLength(); j++) {
                if (plants.item(j).getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }

                Node localNode = plants.item(j);
                switch (localNode.getNodeName()) {
                    case "COMMON" -> common = localNode.getTextContent();
                    case "BOTANICAL" -> botanical = localNode.getTextContent();
                    case "ZONE" -> zone = localNode.getTextContent();
                    case "LIGHT" -> light = localNode.getTextContent();
                    case "PRICE" -> price = localNode.getTextContent();
                    case "AVAILABILITY" -> availability = Integer.parseInt(localNode.getTextContent());
                }

            }
            catalog.add(new Plant(common, botanical, zone, light, price, availability));

        }
        System.out.println(catalog);


    }
}
