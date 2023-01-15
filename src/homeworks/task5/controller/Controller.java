package homeworks.task5.controller;

import homeworks.task5.view.AttendanceView;
import homeworks.task5.view.ShowAllAttendance;
import homeworks.task5.view.SortedStudentByAttendanceDecrease;
import homeworks.task5.view.SortedStudentByAttendanceUnder25Percent;

import java.util.Scanner;

public class Controller {

    private AttendanceView[] attendanceViews = new AttendanceView[3];

    /*
    добавляем в массив AttendanceView классы его наследники
     */
    public Controller() {
        attendanceViews[0] = new ShowAllAttendance();
        attendanceViews[1] = new SortedStudentByAttendanceDecrease();
        attendanceViews[2] = new SortedStudentByAttendanceUnder25Percent();
    }

    /*
    метод, запускает приложение, выводит меню выбора действий в консоле.
     */
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите какое действие нужно выполнить (Введите число от 1 до 3): " +
                    "\n1. Вывести всех студентов." +
                    "\n2. Отсортировать всез студентов по посещаемости." +
                    "\n3. Отсортировать всех студентов, у кого посещаемость меньше 25%" +
                    "\n0. Выход из программы" +
                    "\n>>> ");
            int i;
            try {
                i = scanner.nextInt();  // запрос ввода пользователя
                if (i == 0) {   // проверка ввода нуля(запрос выхода из программы)
                    System.out.println("Выход из программы.");
                    return;
                }

                attendanceViews[i - 1].showInfo();  // вызов метода showInfo() класса, которые находится в массиве по заданному индексу

            } catch (Exception ex) {
                System.out.println("Некорректное значение, повторите ввод. Число должно быть от 1 до 3.");
                System.out.println("***********************************");
            }
        }
    }
}
