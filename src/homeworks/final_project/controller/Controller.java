package homeworks.final_project.controller;


import java.util.Scanner;

public class Controller {

    public void run() {
        System.out.println("Приветствую, тебя, пользователь!!!");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите цифру необходимого действия действие:\n" +
                    "1. Создать/удалить контрагента." +
                    "2. Создать/удалить способ связи с контрагентом." +
                    "3. Посмотреть информацию о контрагенте(-ах)." +
                    "0. Выход из программы.");
            int input = scanner.nextInt();

        }
    }
}
