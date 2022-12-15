package homeworks.task1;

import homeworks.task1.products.Coffee;
import homeworks.task1.products.Product;
import homeworks.task1.products.Tea;
import homeworks.task1.vending.HotDrinkVendingMachine;
import homeworks.task1.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new HotDrinkVendingMachine(5000, 1000, 500);
        Product product = new Coffee("coffee", 150, 200, 90, 10);
        Product product1 = new Tea("tea", 100, 500, 90, 5);

        vendingMachine.addProductTitle(product);
        vendingMachine.addProductTitle(product1);

        vendingMachine.showProductList();
        vendingMachine.setDeposit(200);
        System.out.println(vendingMachine.getDeposit());


    }
}
