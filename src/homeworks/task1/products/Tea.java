package homeworks.task1.products;

public class Tea extends HotDrink{

    private int teaOfRecipe;

    public Tea(String title, int price, int volume, int temprature, int teaOfRecipe) {
        super(title, price, volume, temprature);
        this.teaOfRecipe = teaOfRecipe;
    }

    public int getTeaOfRecipe() {
        return teaOfRecipe;
    }

    public void setTeaOfRecipe(int teaOfRecipe) {
        this.teaOfRecipe = teaOfRecipe;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
