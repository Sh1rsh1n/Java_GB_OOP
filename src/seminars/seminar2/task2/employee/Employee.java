package seminars.seminar2.task2.employee;

public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract String getPosition();

    public abstract int getSalary();

    public abstract String getAction();

    public String getName() {
        return name;
    }
}
