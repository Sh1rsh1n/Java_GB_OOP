package seminars.seminar5.task1.service;

import seminars.seminar5.task1.model.Student;
import seminars.seminar5.task1.util.DataReader;
import seminars.seminar5.task1.util.DataWriter;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements DataService<Student> {

    private final String path = "studentDB.txt";

    private List<Student> students = new ArrayList<>();

    @Override
    public void addUser(Student student) {
        students.add(student);
    }

    @Override
    public void save() {
        DataWriter.dataWrite(students);
    }

    @Override
    public List<Student> load() {
        return DataReader.dataRead(path);
    }
}
