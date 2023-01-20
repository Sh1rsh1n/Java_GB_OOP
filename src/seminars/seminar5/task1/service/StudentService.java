package seminars.seminar5.task1.service;

import seminars.seminar5.task1.model.Student;
import seminars.seminar5.task1.util.DataReader;
import seminars.seminar5.task1.util.DataWriter;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements DataService<Student> {

    private final String path = "studentDB.txt";

    private List<Student> students = new ArrayList<>();

    public List<Student> getUsers() {
        return new ArrayList<>(students);
    }

    @Override
    public void addUser(Student student) {
        students.add(student);
    }

    @Override
    public void save() {
        DataWriter.dataWrite(students);
    }

    @Override
    public void load() {
        students = DataReader.dataRead(path);
    }
}
