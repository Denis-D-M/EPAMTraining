package XML.FirstExamples.SAXPlanCatalogParser;

public class Main {
    public static void main(String[] args) {
        SaxParser saxParser = new SaxParser();
        Catalog catalog = saxParser.parse();
        System.out.println(catalog.toString());
    }
}
