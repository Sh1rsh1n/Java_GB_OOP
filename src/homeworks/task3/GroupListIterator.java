package homeworks.task3;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public class GroupListIterator implements ListIterator<Student> {

    private int index = 0;

    private Group group;

    public GroupListIterator(Group group) {
        this.group = group;
    }

    @Override
    public boolean hasNext() {
        return index < group.studentAmount();
    }

    @Override
    public Student next() {
        return group.getStudent(index++);
    }

    @Override
    public boolean hasPrevious() {
        return index < 0;
    }

    @Override
    public Student previous() {
        if (!hasPrevious()){
            throw new NoSuchElementException();
        }
        return group.getStudent(index - 1);
    }

    @Override
    public int nextIndex() {
        return index;
    }

    @Override
    public int previousIndex() {
        return index - 1;
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
