package homeworks.task1;

import homeworks.task1.products.HotDrink;
import homeworks.task1.products.Product;
import homeworks.task1.vending.HotDrinkVendingMachine;
import homeworks.task1.vending.VendingMachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static void vendingMachineActions(VendingMachine vm) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            if (vm instanceof HotDrinkVendingMachine) {
                System.out.println("\nАВТОМАТ ГОРЯЧИХ НАПИТКОВ");

                vm.showAllProduct();
                String enterNum = scan.next();
                if (enterNum.equals("quit")) {
                    break;
                } else if (enterNum.matches("[0-9]")) {
                    String product = vm.getProductById(Integer.parseInt(enterNum));
                    System.out.println(product);
                } else {
                    System.out.println("Некорректное значение. Повторите ввод.");
                }
            }
        }
        scan.close();
    }

    public static void main(String[] args) {
        Map<Integer, Product> productMap = new HashMap<>();
        productMap.put(1, new HotDrink("Кола", 99, 10));
        productMap.put(2, new HotDrink("Чай", 150, 70));
        productMap.put(3, new HotDrink("Кофе", 200, 80));
        productMap.put(4, new HotDrink("Вода", 50, 15));
        productMap.put(5, new Product("Сникерс", 150));
        productMap.put(6, new Product("Печеньки", 50));

        vendingMachineActions(new HotDrinkVendingMachine(productMap));

    }
}
