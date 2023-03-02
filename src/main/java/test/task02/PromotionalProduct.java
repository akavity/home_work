package test.task02;

public class PromotionalProduct extends Product {

    private final int discount;

    public PromotionalProduct(String name, double price, int discount) {
        super(name, price);
        this.discount = discount;
    }
    @Override
    public String toString() {
        return String.format("Product: %s,  Price: %s, Discount: %s", getName(), getPrice(), getDiscount());
    }

    public int getDiscount() {
        return discount;
    }

}
