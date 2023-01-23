package homeworks.final_project.controller;


import homeworks.final_project.exceptions.NotFoundCommunicationException;
import homeworks.final_project.service.DataService;
import homeworks.final_project.ui.*;

import java.util.Scanner;

public class Controller {

    BaseMenu[] view;
    DataService dataService;

    public Controller(DataService dataService) {
        this.dataService = dataService;
        view = new BaseMenu[]{new ContractorMenu(), new CommunicationMenu(), new GetContractorInfo()};
    }

    public void run() throws NotFoundCommunicationException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветствую тебя, пользователь!!!\nСпасибо, что выбрали наше приложение: \"Контрагент\"\n");

        while (true) {
            System.out.println("Введите цифру необходимого действия действие:\n" +
                    "1. Добавить/удалить контрагента.\n" +
                    "2. Добавить/удалить способ связи с контрагентом.\n" +
                    "3. Посмотреть информацию о контрагенте(-ах).\n" +
                    "0. Выход из программы.\n");
            System.out.print(">>>\t");
            int input = scanner.nextInt();

            if (input >= 1 && input <= 3) {
                view[input - 1].showMenu(dataService);
            }
            if (input == 0) {
                System.out.println("До свидания!!!");
                break;
            }
        }

        scanner.close();
    }
}
