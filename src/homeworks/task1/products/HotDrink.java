package homeworks.task1.products;

public class HotDrink extends Product{

    private int volume;
    private int temprature;


    public HotDrink(String title, int price, int volume, int temprature) {
        super(title, price);
        this.volume = volume;
        this.temprature = temprature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemprature() {
        return temprature;
    }

    public void setTemprature(int temprature) {
        this.temprature = temprature;
    }

    @Override
    public String toString() {
        return String.format("{ Напиток: %s, Цена: %d }", super.getTitle(), super.getPrice());
    }
}
