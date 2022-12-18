package homeworks.task2.writerPatterns;

import homeworks.task2.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class WriteToJSON implements WriteTo {

    private final List<Student> studentList;

    public WriteToJSON(List<Student> studentList) {
        this.studentList = studentList;
    }


    public void write() {
        System.out.println("Отработал метод из класса WriteToJSON");
        try (FileWriter fileWriter = new FileWriter("src//homeworks//task2//studentList.json", false)) {

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

        Iterator<Student> iter = studentList.iterator();

        sb.append("{\n");
        while (iter.hasNext()) {    // проходим по всей коллекции, пока есть элементы
            Student st = iter.next();
            sb.append(String.format("\"%s %s\": %s", st.getName(), st.getSurname(), st.getAvgGrade()));
            if (iter.hasNext()) { // чтобы последняя строка записывалась без запятой и переноса строки
                sb.append(",\n");
            }
        }
        sb.append("\n}");
        return sb.toString();
    }
}



