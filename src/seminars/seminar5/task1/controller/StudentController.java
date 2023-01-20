package seminars.seminar5.task1.controller;

import seminars.seminar5.task1.model.Student;
import seminars.seminar5.task1.service.StudentService;
import seminars.seminar5.task1.ui.StudentView;

import java.util.Scanner;

public class StudentController implements UserController{

    private StudentService model;
    private StudentView view;

    public StudentController(StudentService model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие");
            System.out.println("1. Загрузить студентов из файла");
            System.out.println("2. Добавить студента");
            System.out.println("3. Напечатать всех студентов");
            System.out.println("4. Сохранить студентов");
            System.out.println("5. Выйти из программы");

            int index = scanner.nextInt();

            switch (index) {
                case 1: model.load(); break;
                case 2: model.addUser(new Student(scanner.next(), "Ivanov", 21, 3, 4.2f)); break;
                case 3: view.showUsers(); break;
                case 4: model.save(); break;
                case 5: return;
            }
        }
    }


}
