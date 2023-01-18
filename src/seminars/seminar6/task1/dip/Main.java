package seminars.seminar6.task1.dip;

public class Main {
    public static void main(String[] args) {
        Switch sw = new Switch(new Lamp());
        sw.toggle();
        sw.toggle();
        sw.toggle();
        sw.toggle();
    }
}
