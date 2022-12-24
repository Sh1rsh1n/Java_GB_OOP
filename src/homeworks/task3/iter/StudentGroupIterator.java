package homeworks.task3.iter;

import homeworks.task3.Student;

import java.util.Iterator;

/*
класс имплементирует интерфейс Iterator, переопределяем его методы
 */
public class StudentGroupIterator implements Iterator<Student> {

    int index = 0;
    StudentGroup studentGroup;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
        return index < studentGroup.groupSize();    // пока index меньше размера коллекции из studentGroup
    }

    @Override
    public Student next() {
        return studentGroup.nextStudent(index++);   // возвращаем элемент и увеличиваем значение index
    }
}
