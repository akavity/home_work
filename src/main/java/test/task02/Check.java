package test.task02;

import java.util.List;

public class Check {
    private List<ProductInBasket> priceOfProducts;
    private int totalAmount;

    public Check(List<ProductInBasket> priceOfProducts, int totalAmount) {
        this.priceOfProducts = priceOfProducts;
        this.totalAmount = totalAmount;
    }
}
