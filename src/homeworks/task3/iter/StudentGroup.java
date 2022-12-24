package homeworks.task3.iter;

import homeworks.task3.Student;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
класс - описание группы студентов
 */
public class StudentGroup{

    private List<Student> list;

    public StudentGroup(List<Student> list) {
        this.list = list;
    }

    /*
    метод iterator, возвращает объект типа StudentGroupIterator, который содержит методы для обхода коллекции в прямой последовательности
     */
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    /*
    метод listIterator, возвращает объект типа StudentGroupListIterator,
    который содержит методы для обхода коллекции в прямой и обратной последовательности
     */
    public ListIterator<Student> listIterator(int index) {
        return new StudentGroupListIterator(this, index);
    }

    /*
    метод reverseIterator, возвращает объект типа ReverseIterator,
    который содержит методы для обхода коллекции в обратной последовательности
     */
    public Iterator<Student> reverseIterator() {
        return new ReverseIterator(this);
    }

    /*
    метод, возвращает размер коллекции
     */
    public int groupSize() {
        return list.size();
    }

    /*
    метод, возвращает объект коллекции по индексу
     */
    public Student nextStudent(int index) {
        return list.get(index);
    }
}
