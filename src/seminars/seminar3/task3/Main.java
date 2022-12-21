package seminars.seminar3.task3;

import java.util.*;

/*
Создайте и наполните LinkedList<String> строками.
Используйте descendingIterator (), чтобы пройтись по нему с конца к началу.
Используйте метод LinkedList<String> listIterator (), чтобы получить свободно перемещающийся итератор. Пройдитесь по списку и замените все строки их заглавными версиями.
Напишите программу, которая позволяет пользователю управлять перемещением ListIterator<String> по шагам. Нужны следующие команды:
Шаг вперёд
Шаг назад
Удалить элемент на текущей позиции
Вставить новый элемент на текущей позиции
 */
public class Main {


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("create");
        list.add("update");
        list.add("read");
        list.add("delete");

        // task A
        Iterator<String> iterator = list.descendingIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // task B
        System.out.println();
        ListIterator<String> iterator1 = list.listIterator(list.size());

        while (iterator1.hasPrevious()) {
            System.out.println(iterator1.previous().toUpperCase());
        }
        System.out.println();

        //task C
//        Scanner scanner = new Scanner(System.in);
//        ListIterator<String> listIterator = list.listIterator();
//
//        String action = scanner.next();
//
//        if (action.equals("f") && ) {

//        }









    }
}
