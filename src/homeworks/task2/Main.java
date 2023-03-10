package homeworks.task2;

import homeworks.task2.writerPatterns.WriteTo;
import homeworks.task2.writerPatterns.WriteToJSON;
import homeworks.task2.writerPatterns.WriteToText;
import homeworks.task2.writerPatterns.WriteToXML;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student("Антон", "Иванов", 4.5f));
        listStudents.add(new Student("Анна", "Попова", 4.7f));
        listStudents.add(new Student("Кирилл", "Кузьмин", 3.8f));
        listStudents.add(new Student("Петр", "Попов", 3.5f));
        listStudents.add(new Student("Дмитрий", "Козлов", 4.2f));

        WriteTo txt = new WriteToText(listStudents);
        txt.write();
        WriteTo json = new WriteToJSON(listStudents);
        json.write();
        WriteTo xml = new WriteToXML(listStudents);
        xml.write();
    }
}
