/*
Класс Группа содержит в себе коллекцию Студентов. По группе можно перемещаться с помощью итератора. (Это повторяет 1-ю задачу из классной работы). Остальные задачи надстраиваются поверх неё.

Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях. Он реализует интерфейс ListIterator<Student>.
Добавьте в Группу метод listIterator (), который позволяет начать итерацию с помощью GroupListIterator.

Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
• Он отслеживает текущую позицию в переборе
• Он изначально выставлен на конечную позицию
• Он движется справа налево
Проверьте, как он работает.
 */

package homeworks.task3;

import homeworks.task3.iter.StudentGroup;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>(Arrays.asList(
                new Student("Alex", "Popov", 4.2f),
                new Student("Dasha", "Ivanova", 3.9f),
                new Student("Oleg", "Smirnov", 4.8f)));

        StudentGroup studentGroup = new StudentGroup(list);

        System.out.println("============== STUDENT GROUP ITERATOR ===================");
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("============== STUDENT GROUP LIST ITERATOR ===================");
        ListIterator<Student> listIterator = studentGroup.listIterator(1);
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("============== STUDENT GROUP REVERSE ITERATOR ===================");
        Iterator<Student> reverseIterator = studentGroup.reverseIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}



