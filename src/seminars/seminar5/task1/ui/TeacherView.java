package seminars.seminar5.task1.ui;

import seminars.seminar5.task1.model.Teacher;
import seminars.seminar5.task1.service.DataService;

public class TeacherView extends UserView<Teacher> {

    public TeacherView(DataService<Teacher> model) {
        super(model);
    }
}
