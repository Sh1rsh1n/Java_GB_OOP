package homeworks.task2;

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

    public String getSurname() {
        return surname;
    }

    public float getAvgGrade() {
        return avgGrade;
    }
}



