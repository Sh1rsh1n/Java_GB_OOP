package seminars.seminar5.task1.ui;

import seminars.seminar5.task1.model.Student;
import seminars.seminar5.task1.service.DataService;


public class StudentView extends UserView<Student> {

    public StudentView(DataService<Student> model) {
        super(model);
    }
}
