package StreamAPI;

public class Product implements Predicate{
    private String type;

    public String getType() {
        return type;
    }

    @Override
    public boolean match(Product product) {
        return this.getType().equals(product.getType());
    }
}
