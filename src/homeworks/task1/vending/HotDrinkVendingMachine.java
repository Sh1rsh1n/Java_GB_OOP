package homeworks.task1.vending;

import homeworks.task1.products.Product;

public class HotDrinkVendingMachine extends VendingMachine{

    private int waterAmount;
    private int coffeeAmount;
    private int teaAmount;

    public HotDrinkVendingMachine(int waterAmount, int coffeeAmount, int teaAmount) {
        this.waterAmount = waterAmount;
        this.coffeeAmount = coffeeAmount;
        this.teaAmount = teaAmount;
    }
}
