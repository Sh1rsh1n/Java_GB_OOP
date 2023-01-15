package homeworks.task5.view;

import homeworks.task5.model.Student;
import homeworks.task5.service.AttendanceService;

import java.util.Collections;
import java.util.List;

/*
класс сортирует студентов по убыванию.
порядок сортировки задается методом compareTo() в классе Student
 */
public class SortedStudentByAttendanceDecrease extends AttendanceView{
    private final List<Student> studentList = new AttendanceService().getStudentList();

    /*
    метод выводит информацию о студентах в консоль
     */
    @Override
    public void showInfo() {
        System.out.println("***********************************");
        System.out.println("Выбрана сортировка списка студентов по посещаемости");
        System.out.println("***********************************");
        Collections.sort(studentList);  // сортируем студентов
        for (Student student: studentList) {
            System.out.printf("Имя: %s, Фамилия: %s, Курс: %d\nДаты посещения занятий:\n%s\nПроцент посещения: %d\n=======================\n",
                    student.getName(),
                    student.getSurname(),
                    student.getCourse(),
                    student.getAttendance(),
                    student.getAttendance().percentAttendance());        }
        System.out.println("***********************************");
    }
}
