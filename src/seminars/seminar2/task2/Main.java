package seminars.seminar2.task2;

import seminars.seminar2.task2.employee.Company;
import seminars.seminar2.task2.employee.Designer;
import seminars.seminar2.task2.employee.Employee;
import seminars.seminar2.task2.employee.Programmer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Programmer("Denis"));
        list.add(new Programmer("Alexey"));
        list.add(new Designer("Anton"));
        list.add(new Designer("Masha"));

        Company company = new Company(list);
        company.goWork();
    }
}
