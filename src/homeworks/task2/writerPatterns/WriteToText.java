package homeworks.task2.writerPatterns;

import homeworks.task2.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToText implements WriteTo {

    List<Student> studentList;

    public WriteToText(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void write() {

        try (FileWriter fileWriter = new FileWriter("src//homeworks//task2//text.txt", true)) {
            for (Student student: studentList) {
                fileWriter.write(String.format("%s %s=%s", student.getName(), student.getSurname(), student.getAvgGrade()));
                fileWriter.append('\n');
                fileWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



