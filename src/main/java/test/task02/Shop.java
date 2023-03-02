package test.task02;

import java.util.HashMap;
import java.util.Map;


public class Shop {
    private final Basket basket;
    private Map<Product, Integer> productsInShop;

    public Shop() {
        this.basket = new Basket();
        this.productsInShop = new HashMap<>();
    }

    public void addProductsInShop(Product product, Integer amount) {
        productsInShop.put(product, amount);
    }

    public void printProductList() {
        StringBuilder listOfProducts = new StringBuilder();
//        for (Map.Entry<Product, Integer> item : productsInShop.entrySet()) {
//            ("Product: %s  Amount: %s  Price: %s \n", item.getKey().getName(), item.getValue(),
//                    item.getKey().getPrice());
//        }
    }

    public Basket getBasket() {
        return basket;
    }

    public Map<Product, Integer> getProductsInShop() {
        return productsInShop;
    }
}
