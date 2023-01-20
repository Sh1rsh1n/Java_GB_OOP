package seminars.seminar5.task1.ui;

import seminars.seminar5.task1.model.Student;
import seminars.seminar5.task1.model.User;
import seminars.seminar5.task1.service.DataService;

public abstract class UserView<U extends User> {
    private DataService<U> model;

    public UserView(DataService<U> model) {
        this.model = model;
    }

    public void showUsers() {
        for (U user: model.getUsers()) {
            System.out.println(user);
        }
    }
}

