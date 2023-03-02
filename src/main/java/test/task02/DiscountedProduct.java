package test.task02;

public class DiscountedProduct extends PromotionalProduct {
    private final String reason;

    public DiscountedProduct(String name, double price, int discount, String reason) {
        super(name, price, discount);
        this.reason = reason;
    }

    @Override
    public String toString() {
        return String.format("Product: %s,  Price: %s, Discount: %s, Reason: %s",
                getName(), getPrice(), getDiscount(), getReason());
    }

    public String getReason() {
        return reason;
    }
}
