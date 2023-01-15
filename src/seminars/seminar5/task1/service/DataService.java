package seminars.seminar5.task1.service;

import seminars.seminar5.task1.model.User;

import java.util.List;

public interface DataService<U extends User> {

    void addUser(U user);

    void save();

    List<U> load();
}
