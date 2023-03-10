package homeworks.task1.products;

public class HotDrink extends Product {

    private int temprature;

    public HotDrink(String title, int price, int temprature) {
        super(title, price);
        this.temprature = temprature;
    }

    public int getTemprature() {
        return temprature;
    }

    @Override
    public String toString() {
        return String.format(">>> Напиток: %s, Цена: %d, Teмпература: %d <<<", super.getTitle(), super.getPrice(), temprature);
    }
}
