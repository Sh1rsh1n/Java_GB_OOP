package homeworks.task1.vending;

import homeworks.task1.products.Product;

import java.util.*;

public class VendingMachine {
    private Map<Integer, Product> productMap;

    public VendingMachine(Map<Integer, Product> productMap) {
        this.productMap = productMap;
    }

    public Map<Integer, Product> getProductMap() {
        return productMap;
    }

    public void showAllProduct() {
        System.out.println("Список продуктов: ");
        for (Map.Entry<Integer, Product> entry : productMap.entrySet()) {
            System.out.printf("\nНомер %d - Название: %s\n", entry.getKey(), entry.getValue().getTitle());
        }
        System.out.print("Введите номер товара: ");
    }

    public String getProductById(int productId) {
        for (Map.Entry<Integer, Product> entry : productMap.entrySet()) {
            if (entry.getKey() == productId) {
                return entry.getValue().toString();
            }
        }
        return "Продукт не найден";
    }
}

