package seminars.seminar6.task1.srp;

public class DrawRectangle {
    private CalcRectangle calcRectangle;

    public DrawRectangle(CalcRectangle calcRectangle) {
        this.calcRectangle = calcRectangle;
    }

    // графическая задача
    public void draw () {
        GraphicsLibrary.drawRectangle(0, 0, calcRectangle.getWidth(), calcRectangle.getHeight(), '#');
    }
}
