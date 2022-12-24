package homeworks.task3.iter;


import homeworks.task3.Student;

public class ReverseIterator extends StudentGroupIterator {

    public ReverseIterator(StudentGroup studentGroup) {
        super(studentGroup);
        index = studentGroup.groupSize() - 1;   // ставим "курсор" на последнюю позицию
    }

    /*
    метод hasNext проверяет, существует элемент в коллекции пока индекс больше -1
     */
    public boolean hasNext() {
        return index > -1;
    }

    /*
    метод next возвращает элемент и использует оператор декримента, чтобы проходить по коллекции в обратном порядке
     */
    public Student next() {
        return studentGroup.nextStudent(index--);
    }

}
