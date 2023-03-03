package test.task02;

import java.util.HashMap;
import java.util.Map;

public class Shop {

    private final Map<Product, Integer> productsInShop;

    public Shop() {
        this.productsInShop = new HashMap<>();
    }

    public void addProductsInShop(Product product, Integer amount) {
        productsInShop.put(product, amount);
    }

    public Basket getBasket() {
        return new Basket();
    }

    public Map<Product, Integer> getProductsInShop() {
        return productsInShop;
    }

    public void printListOfProducts() {
        for (Map.Entry<Product, Integer> item : productsInShop.entrySet()) {
            System.out.printf("Product: %s  Amount: %s  Price: %s \n",
                    item.getKey().getName(), item.getValue(), item.getKey().getPrice());
        }
    }

    public int getProduct(Product product, int amount) {
        int result;
        int numberOfProducts = productsInShop.get(product);
        if (numberOfProducts < amount) {
            result = 0;
        } else {
            int balance = numberOfProducts - amount;
            productsInShop.replace(product, balance);
            result = amount;
        }
        return result;
    }

    public Check getCheck(Basket basket) {
        Check check = new Check(basket.getListOfProducts(), basket.getAllPrice());
        return check;
    }
}
