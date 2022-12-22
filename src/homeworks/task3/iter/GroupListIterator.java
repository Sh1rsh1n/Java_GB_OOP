package homeworks.task3.iter;

import homeworks.task3.Student;

import java.util.ListIterator;

public class GroupListIterator<S> implements ListIterator<Student> {

    private int current = 0;
    private StudentGroup students;

    public GroupListIterator(int current) {
        this.current = current;

    }

    @Override
    public boolean hasNext() {
        return current < students.groupSize();
    }

    @Override
    public Student next() {
        return students.getStudent(current++);
    }

    public GroupListIterator() {
    }

    @Override
    public boolean hasPrevious() {
        return current != 0;
    }

    @Override
    public Student previous() {
        return students.getStudent(current--);
    }

    @Override
    public int nextIndex() {
        return current;
    }

    @Override
    public int previousIndex() {
        return current - 1;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(Student student) {

    }

    @Override
    public void add(Student student) {

    }
}
