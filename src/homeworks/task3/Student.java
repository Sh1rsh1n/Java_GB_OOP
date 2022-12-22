package homeworks.task3;

import java.time.LocalDate;

public class Student {
    private String name;
    private String surname;
    private float avgGrade;

    public Student(String name, String surname, float avgGrade) {
        this.name = name;
        this.surname = surname;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname=" + surname +
                ", avgGrade=" + avgGrade +
                '}';
    }

}
