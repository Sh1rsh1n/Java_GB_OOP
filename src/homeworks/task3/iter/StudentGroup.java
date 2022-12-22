package homeworks.task3.iter;

import homeworks.task3.Student;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentGroup implements Iterable<Student> {

    private List<Student> list;

    public StudentGroup(List<Student> list) {
        this.list = list;
    }

    @Override
    public Iterator<Student> iterator() {
        return listIterator(0);
    }

    public ListIterator<Student> listIterator(final int index) {
        return list.listIterator(index);
    }

    public int groupSize() {
        return list.size();
    }

    public Student getStudent(int index) {
        return list.get(index);
    }
}
