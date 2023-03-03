package test.task02;

public class Task02 {
    public static void main(String[] args) {
        Shop santaShop = new Shop();

        Product bread = new Product("Bread", 12.5);
        Product milk = new Product("Milk", 10.5);
        Product cucumber = new Product("Cucumber", 18);
        Product sausages = new Product("Sausages", 18);

        santaShop.addProductsInShop(bread, 40);
        santaShop.addProductsInShop(milk, 80);
        santaShop.addProductsInShop(cucumber, 100);
        santaShop.addProductsInShop(sausages, 50);

        Basket myBasket = santaShop.getBasket();
        santaShop.printListOfProducts();





    }

}
