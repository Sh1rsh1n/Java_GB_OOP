package homeworks.task1.vending;

import homeworks.task1.products.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    List<Product> productList = new ArrayList<>();

    private int deposit;
    public VendingMachine() {
        this.deposit = 0;
    }

    public void addProductTitle(Product product) {
        productList.add(product);
    }

    public void showProductList() {
        System.out.println("Список всех товаров:");
        for (Product product : productList ) {
            System.out.println(product);
        }
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }
}
