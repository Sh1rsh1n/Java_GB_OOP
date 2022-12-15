package homeworks.task1.products;

public class Coffee extends HotDrink{

    private int coffeeOfRecipe;

    public Coffee(String title, int price, int volume, int temprature, int coffeeOfRecipe) {
        super(title, price, volume, temprature);
        this.coffeeOfRecipe = coffeeOfRecipe;
    }

    public int getCoffeeOfRecipe() {
        return coffeeOfRecipe;
    }

    public void setCoffeeOfRecipe(int coffeeOfRecipe) {
        this.coffeeOfRecipe = coffeeOfRecipe;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
