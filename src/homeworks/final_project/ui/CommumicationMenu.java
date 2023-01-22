package homeworks.final_project.ui;

import homeworks.final_project.model.communications.*;
import homeworks.final_project.service.DataService;

import java.util.Scanner;

public class CommumicationMenu implements BaseMenu {

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
        String communication = scanner.nextLine();
        Communication[] communications = {
                new Email(communication),
                new Phone(communication),
                new TelegramNikName(communication),
                new VK_URL(communication),
                new Address(communication)
        };
        service.addCommunication(communications[input]);
    }
}
