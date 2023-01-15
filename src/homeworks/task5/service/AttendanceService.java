package homeworks.task5.service;

import homeworks.task5.model.Attendance;
import homeworks.task5.model.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AttendanceService {
    public final String path = "student_group.txt";
    private final List<Student> studentList;

    public AttendanceService() {
        studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return new ArrayList<>(dataRead());
    }

    /*
    метод, обрабатывает данные полученные из файла с информацией о студентах
    и возвращает их в виде списка

    предполагается, что данные в файле, будут всегда одного формата и вида
     */
    private List<Student> dataRead() {
        // получаем данные из файла
        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String str;
            // читаем данные построчно, пока есть что читать
            while ((str = bf.readLine()) != null) {
                Attendance attendance = new Attendance();
                // получаем массив строк, за разделитель берем ","
                String[] array = str.split(",");
                // проходим по массиву строк начиная с 3 индекса, каждую итерацию увеличиваем индекс на 4, чтобы корректно получать данные о дате и посещении
                for (int i = 3; i < array.length; i += 4) {
                    // вызываем метод addDateVisit() и добавляем данные о посещении текущему студенту
                    attendance.addDateVisit(LocalDate.of(Integer.parseInt(array[i]), Integer.parseInt(array[i + 1]), Integer.parseInt(array[i + 2])), Boolean.parseBoolean(array[i + 3]));
                }
                // создаем студента
                Student student = new Student(array[0], array[1], Integer.parseInt(array[2]), attendance);
                // добавляем студента в список
                studentList.add(student);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return studentList;
    }

}
