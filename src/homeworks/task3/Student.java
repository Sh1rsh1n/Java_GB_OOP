package homeworks.task3;

public class Student {
    private String name;
    private String surname;
    private String avgGrade;

    public Student(String name, String surname, String avgGrade) {
        this.name = name;
        this.surname = surname;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", avgGrade='" + avgGrade + '\'' +
                '}';
    }
}
