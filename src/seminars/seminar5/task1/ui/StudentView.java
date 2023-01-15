package seminars.seminar5.task1.ui;

import seminars.seminar5.task1.model.Student;
import seminars.seminar5.task1.service.StudentService;

import java.util.List;

public class StudentView {

    private StudentService service;

    public StudentView(StudentService service) {
        this.service = service;
    }

    public void showStudents() {
        List<Student> list = service.load();
        for (Student student: list) {
            System.out.println(student);
        }
    }
}
