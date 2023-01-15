package seminars.seminar5.task1.model;

import java.util.List;

public class Teacher extends User{

    private List<String> subjects;

    public Teacher(String name, String surname, int age, List<String> subjects) {
        super(name, surname, age);
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subjects=" + subjects +
                "} " + super.toString();
    }
}
