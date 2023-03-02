package test.task02;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Product> products;

    public Basket() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
