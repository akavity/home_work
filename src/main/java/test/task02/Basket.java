package test.task02;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<ProductInBasket> listOfProducts;

    public Basket() {
        this.listOfProducts = new ArrayList<>();
    }

    public void addProduct(Product product, int amount) {
        ProductInBasket productInBasket = new ProductInBasket(product, amount);
        listOfProducts.add(productInBasket);
    }

    public void printProductsInBasket() {
        for (ProductInBasket product : listOfProducts)
            System.out.printf("Product: %s  Amount: %s \n", product.getProduct().getName(), product.getAmount());
    }

    public int getAllPrice() {
        int price = 0;
        for (ProductInBasket product : listOfProducts) {
            price += product.getAmount() * product.getProduct().getPrice();
        }
        return price;
    }

    public List<ProductInBasket> getListOfProducts() {
        return listOfProducts;
    }
}
