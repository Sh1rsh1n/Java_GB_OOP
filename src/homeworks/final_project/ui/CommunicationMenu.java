package homeworks.final_project.ui;

import homeworks.final_project.service.DataService;

import java.util.Scanner;

public class CommunicationMenu implements BaseMenu {

    @Override
    public void showMenu(DataService service) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру нужного способа связи:\n" +
                "1. Электронная почта.\n" +
                "2. Телефон.\n" +
                "3. Никнэйм в Telegram.\n" +
                "4. Адрес страницы в VK.\n");
        int input = scanner.nextInt();
        System.out.println("Введите способ связи:\n");

    }
}
