package homeworks.task2.writerPatterns;

import homeworks.task2.Student;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

public class WriteToXML implements WriteTo {

    private final List<Student> studentList;

    public WriteToXML(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void write() {
        System.out.println("Отработал метод из класса WriteToXML");
        try (FileWriter fileWriter = new FileWriter("src//homeworks//task2//studentList.xml", false)) {
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
        String[] fields = studentClassFields(); // получаем данные из метода studentClassFields()

        Iterator<Student> iter = studentList.iterator();

        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n"); // записываем "шапку" xml-файла
        sb.append(String.format("<%ss>", fields[0]));   // записываем тэг <students>
        while (iter.hasNext()) {    // итерируемся по коллекции пока в ней есть элементы
            Student st = iter.next();
            sb.append(String.format("\n\t<%s>\n", fields[0]));  // записываем тэг <student>
            sb.append(String.format("\t\t<%s>%s</%s>\n", fields[1], st.getName(), fields[1])); // записываем тэги <name>
            sb.append(String.format("\t\t<%s>%s</%s>\n", fields[2], st.getSurname(), fields[2]));
            sb.append(String.format("\t\t<%s>%s</%s>\n", fields[3], st.getAvgGrade(), fields[3]));
            sb.append(String.format("\t</%s>", fields[0]));
        }
        sb.append(String.format("\n<%ss>", fields[0]));
        return sb.toString();
    }

    private String[] studentClassFields() {
        Class<Student> myClass = Student.class;
        Field[] fields = myClass.getDeclaredFields();

        String[] fieldsArray = new String[fields.length + 1];
        fieldsArray[0] = myClass.getName().toLowerCase().substring(16);
        fieldsArray[1] = fields[0].getName().toLowerCase();
        fieldsArray[2] = fields[1].getName().toLowerCase();
        fieldsArray[3] = fields[2].getName().toLowerCase();

        return fieldsArray;
    }
}



