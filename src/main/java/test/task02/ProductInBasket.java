package test.task02;

public class ProductInBasket {
    private Product product;
    private int amount;

    public ProductInBasket(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }
}
