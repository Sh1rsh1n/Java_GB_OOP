package homeworks.task2.writerPatterns;

import homeworks.task2.Student;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToText implements WriteTo {

    private final List<Student> studentList;

    public WriteToText(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void write() {
        System.out.println("Отработал метод из класса WriteToText");
        try (FileWriter fileWriter = new FileWriter("src//homeworks//task2//studentList.txt", false)) {
            String text = makeText();
            fileWriter.write(text); // записываем полученные данные из метода makeText() в файл
            fileWriter.append('\n');
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String makeText() {
        StringBuilder sb = new StringBuilder();
        for (Student student : studentList) {   // проходим по всем элементам коллекции и проебразуем в нужный формат/вид
            sb.append(String.format("%s %s=%s\n", student.getName(), student.getSurname(), student.getAvgGrade()));
        }
        return sb.toString();
    }
}


