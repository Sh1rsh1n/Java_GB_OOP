package homeworks.task3;

import java.util.Iterator;
import java.util.List;

public class Group implements Iterable<Student> {
    private List<Student> studentList;

    public Group(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int studentAmount() {
        return studentList.size();
    }

    public Student getStudent(int index) {
        return studentList.get(index);
    }

    @Override
    public Iterator<Student> iterator() {
        return studentList.iterator();
    }
}
