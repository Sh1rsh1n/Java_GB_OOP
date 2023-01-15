package homeworks.task5.view;

import homeworks.task5.model.Student;
import homeworks.task5.service.AttendanceService;

import java.util.List;

/*
класс показывает всю информацию о студентах и из посещаемости
 */
public class ShowAllAttendance extends AttendanceView{
    private final List<Student> studentList = new AttendanceService().getStudentList();

    /*
    метод выводит информацию о студентах в консоль
     */
    @Override
    public void showInfo() {
        System.out.println("***********************************");
        System.out.println("Выбран вывод всего списка студентов");
        System.out.println("***********************************");
        for (Student student: studentList) {
            System.out.printf("Имя: %s, Фамилия: %s, Курс: %d\nДаты посещения занятий:\n%s\nПроцент посещения: %d\n=======================\n",
                    student.getName(),
                    student.getSurname(),
                    student.getCourse(),
                    student.getAttendance(),
                    student.getAttendance().percentAttendance());
        }
        System.out.println("***********************************");

    }


}
