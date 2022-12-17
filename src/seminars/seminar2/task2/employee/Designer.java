package seminars.seminar2.task2.employee;

public class Designer extends Employee{

    public Designer(String name) {
        super(name);
    }

    @Override
    public String getPosition() {
        return "Web-designer";
    }

    @Override
    public int getSalary() {
        return 700;
    }

    @Override
    public String getAction() {
        return "Draw images";
    }


}
