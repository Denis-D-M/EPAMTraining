package XML.FirstExamples.SAXPlanCatalogParser;

public class Main {
    public static void main(String[] args) {
        SaxParser saxParser = new SaxParser();
        Catalog catalog;
        try {
            catalog = saxParser.parse("plan_catalog.xml");
            System.out.println(catalog.toString());
        } catch (MySaxException e) {
            e.printStackTrace();
        }

    }
}
