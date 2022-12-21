package seminars.seminar3.task1;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/*
Создайте класс Student. У студента есть имя, дата рождения и средний балл. Переопределите функцию toString ( ).
Создайте класс StudentGroup. Она содержит коллекцию студентов.
Для коллекции StudentGroup создайте парный класс итератора: StudentGroupIterator. Он реализует интерфейс Iterator<Student>. Он отслеживает текущую позицию в итерации.
Класс StudentGroup реализует интерфейс Iterable<Student>. Это позволяет начать итерацию по группе.
 */
public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Denis", LocalDate.now(), 4.5f);
        Student st2 = new Student("Masha", LocalDate.now(), 4.1f);
        Student st3 = new Student("Anna", LocalDate.now(), 3.6f);
        Student st4 = new Student("Petr", LocalDate.now(), 4.9f);

        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);


        StudentGroup studentGroup = new StudentGroup(list);

//        for (Student student : studentGroup ) {
//            System.out.println(student);
//        }

        Iterator<Student> iter = list.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
