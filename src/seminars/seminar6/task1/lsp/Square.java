package seminars.seminar6.task1.lsp;

public class Square implements Shape {

    private float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public void setWidth(float width) {
        this.side = width;
    }

    @Override
    public void setHeight(float height) {
        this.side = height;
    }

    @Override
    public float getArea() {
        return side * side;
    }

    @Override
    public float getWidth() {
        return side;
    }

    @Override
    public float getHeight() {
        return side;
    }
}
