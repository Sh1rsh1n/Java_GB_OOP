package homeworks.task4;


import homeworks.task4.checks.*;

import java.util.*;

/*
Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
boolean isGood (T item);
Смысл этого интерфейса: ему дают элемент, он его одобряет или не одобряет.
Создайте следующие детские классы:
• IsEven — ему дают целое число, он одобряет его, если оно чётное
• IsPositive — ему дают целое число, он одобряет его, если оно положительное
• BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
• BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет, что она начинается с того, что он запомнил

Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood.
Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.
Продемонстрируйте, что это работает.
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(
                new Random().nextInt(200) - 100,
                new Random().nextInt(200) - 100,
                new Random().nextInt(200) - 100,
                new Random().nextInt(200) - 100,
                new Random().nextInt(200) - 100,
                new Random().nextInt(200) - 100);

        System.out.println("=========== SOURCE LIST ===========");
        System.out.println(integerList);

        System.out.println("=========== AFTER IS EVEN ===========");
        List<Integer> afterIsEven = filter(integerList, new IsEven());
        System.out.println(afterIsEven);


        System.out.println("=========== AFTER IS POSITIVE ===========");
        List<Integer> afterIsPositive = filter(integerList, new IsPositive());
        System.out.println(afterIsPositive);

        List<String> stringList = Arrays.asList(
                "Dabro",
                "Artik & Asti",
                "Scooter",
                "Green Day",
                "Boney M.",
                "Linkin Park",
                "Avicii",
                "Sia",
                "Sia/Sean Paul",
                "Sean Paul/Anne_Marie"
                );

        System.out.println("=========== AFTER BEGIN WITH A ===========");
        List<String> afterBeginsWithA = filter(stringList, new BeginsWithA());
        System.out.println(afterBeginsWithA);

        System.out.println("=========== AFTER BEGIN WITH ===========");
        List<String> afterBeginsWith = filter(stringList, new BeginsWith("Sia"));
        System.out.println(afterBeginsWith);

        // упрощенная реализация, так как интерфейс IsGood является функциональным, то можно проделать следующее:
        System.out.println("=========== CUSTOM ISGOOD ===========");
        List<String> example1 = filter(stringList, e -> e.length() < 6);
        System.out.println(example1);
        List<String> example2 = filter(stringList, e -> e.contains("Pa"));
        System.out.println(example2);
    }

    /*
    метод фильтрации элементов массива на основе классов, которые реализуют интерфейс IsGood
     */
    private static <E> List<E> filter(Iterable<E> array, IsGood<E> isGood) {
        List<E> newArray = new ArrayList<>();   // новый массив, который после фильтрации нужно вернуть вызывающему
        for (E item : array) {
            if (isGood.isGood(item)) {  // проверка всех элементов из входящей коллекции, на основе реализации метода isGood в данном классе
                newArray.add(item);     // добавляем элемент в новую коллекцию, если условие выполняется
            }
        }
        return newArray;
    }
}
