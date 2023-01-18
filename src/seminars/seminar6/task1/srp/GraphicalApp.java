package seminars.seminar6.task1.srp;

public class GraphicalApp {
    public static void main(String[] args) {
        DrawRectangle drawRectangle = new DrawRectangle(new CalcRectangle(8, 8));
        drawRectangle.draw();
    }
}
