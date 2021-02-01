package XML.FirstExamples.SAXPlanCatalogParser;

public class Plant {
    private String common;
    private String botanical;
    private String zone;
    private String light;
    private String price;
    private int availability;

    public Plant(String common, String botanical, String zone, String light, String price, int availability) {
        this.common = common;
        this.botanical = botanical;
        this.zone = zone;
        this.light = light;
        this.price = price;
        this.availability = availability;
    }
    public Plant(){}

    public void setCommon(String common) {
        this.common = common;
    }

    public void setBotanical(String botanical) {
        this.botanical = botanical;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "common='" + common + '\'' +
                ", botanical='" + botanical + '\'' +
                ", zone=" + zone +
                ", light='" + light + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                '}';
    }
}
