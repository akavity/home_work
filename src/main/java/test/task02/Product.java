package test.task02;

public class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return String.format("Product: %s,  Price: %s", getName(), getPrice());
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
