package homeworks.task1.products;

public class Product {
    private String title;
    private int price;

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Продукт: %s, Цена: %d", title, price);
    }
}
