package homeworks.task3.iter;

import homeworks.task3.Student;
import java.util.ListIterator;

/*
класс, наследует StudentGroupIterator, так как методы hasNext и next имеют такую же реализацию
имплементирует ListIterator, и переопределяем его методы (кроме remove, add, set - их нет в заданиии)
 */
public class StudentGroupListIterator extends StudentGroupIterator implements ListIterator<Student> {


    public StudentGroupListIterator(StudentGroup studentGroup, int current) {
        super(studentGroup);
        index = current;
    }

    @Override
    public boolean hasPrevious() {
        return index > -1;
    }

    @Override
    public Student previous() {
        return studentGroup.nextStudent(index--);
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
