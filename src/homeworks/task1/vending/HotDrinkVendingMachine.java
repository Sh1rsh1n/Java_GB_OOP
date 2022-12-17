package homeworks.task1.vending;

import homeworks.task1.products.HotDrink;
import homeworks.task1.products.Product;

import java.util.Map;

public class HotDrinkVendingMachine extends VendingMachine {

    public HotDrinkVendingMachine(Map<Integer, Product> productMap) {
        super(productMap);
    }

    public void showAllProduct() {
        System.out.println("Список горячих напитков: \n");
        for (Map.Entry<Integer, Product> entry : getProductMap().entrySet()) {
            if (!(entry.getValue() instanceof HotDrink)) {
                continue;
            }
            System.out.printf("Номер %d - Название: %s, Цена: %d\n", entry.getKey(), entry.getValue().getTitle(), entry.getValue().getPrice());
        }
        System.out.print("\nВведите номер напитка: ");
    }

    public String getProductById(int productId) {
        for (Map.Entry<Integer, Product> entry : getProductMap().entrySet()) {
            if (entry.getValue() instanceof HotDrink && entry.getKey() == productId) {
                HotDrink hd = (HotDrink) entry.getValue();
                if (hd.getTemprature() > 60) {
                    delayGetting(10);
                    System.out.println("\tОсторожно!!! Напиток горячий!!!");
                } else {
                    delayGetting(3);
                }
                return entry.getValue().toString();
            }
        }
        return "Напиток не найден.\n";
    }

    private void delayGetting(int delay) {
        for (int i = delay; i > 0; i--) {
            System.out.printf("Напиток будет готов через %d\n", i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
