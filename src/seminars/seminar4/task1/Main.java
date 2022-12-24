package seminars.seminar4.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
Пара хранит в себе два значения произвольных типов, например,
Pair<Integer, String> или Pair<Float, Double>.
Напишите самодельный класс Pair, используя обобщения. У него должны быть конструкторы, геттеры и toString ().

Тройка хранит в себе три значения произвольных типов, например,
Triple<Integer, Integer, Integer>. Напишите самодельный класс Triple.

Напишите функцию, которая возвращает тройку случайных целых чисел в диапазоне от 0 до 255 (то есть случайный цвет).
 */
public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "abc");
        Pair<Integer, String> pair2 = new Pair<>(2, "def");

        System.out.println(pair1 + " " + pair2);

        List<Triple<Integer, Double, String>> tripleList = Arrays.asList(
                new Triple<>(250, 3.0, "bmw"),
                new Triple<>(220, 2.5, "audi"),
                new Triple<>(700, 1.4, "lada"));

//        tripleList.add(new Triple<Integer, Double, String>(250, 3.0, "bmw"));
//        tripleList.add(new Triple<Integer, Double, String>(220, 2.5, "audi"));
//        tripleList.add(new Triple<Integer, Double, String>(700, 1.4, "lada"));

        System.out.println(tripleList);
        System.out.println();
        System.out.println(randomColor());
    }

    private static Triple<Integer, Integer, Integer> randomColor(){
        return new Triple<>(genNumber(), genNumber(), genNumber());
    }

    private static int genNumber() {
        return new Random().nextInt(256);
    }
}
