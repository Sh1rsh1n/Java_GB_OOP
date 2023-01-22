package homeworks.final_project.ui;

import homeworks.final_project.exceptions.NotFoundCommunicationException;
import homeworks.final_project.model.Contractor;
import homeworks.final_project.model.communications.*;
import homeworks.final_project.service.DataService;

import java.util.List;
import java.util.Scanner;

public class ContractorMenu implements BaseMenu {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void showMenu(DataService service) throws NotFoundCommunicationException {
        while (true) {
            System.out.println("Меню создания и удаления контрагента\n" +
                    "Введите цифру, нужного действия:\n" +
                    "1. Создать контрагента." +
                    "2. Удалить контрагента." +
                    "3. Вернуться в предыдущее меню." +
                    "0. Выйти из программы.");
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Введите имя контрагента:");
                String addContractorName = scanner.nextLine();
                System.out.println("Добавьте один способ связи:");
                String communication = scanner.nextLine();
                service.addContractor(new Contractor(addContractorName, List.of(checkCommunication(communication))));
                System.out.printf("Контрагент %s успешно добавлен.\n", addContractorName);
                break;
            }
            if (input == 2) {
                System.out.println("Введите имя контрагента:");
                String removeContractorName = scanner.nextLine();
                service.removeContractor(removeContractorName);
                System.out.printf("Контрагент %s успешно удален\n", removeContractorName);
                break;
            }
            if (input == 3) {
                System.out.println("Выход в предыдущее меню.");
                break;
            }
            if (input == 0) {
                System.out.println("Выход из программы.");
                return;
            }
        }
    }

    private Communication checkCommunication(String comm) throws NotFoundCommunicationException {
        if (comm.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
            return new Email(comm);
        if (comm.matches("(\\+*)\\d{11}"))
            return new Phone(comm);
        if (comm.matches(".*\\B@(?=\\w{5,64}\\b)[a-zA-Z0-9]+(?:_[a-zA-Z0-9]+)*.*"))
            return new TelegramNikName(comm);
        if (comm.matches("^https://vk.com/[a-z0-9]+"))
            return new VK_URL(comm);
        if (comm.matches("\\w+[-]\\d+")) {
            return new Address(comm);
        }
        throw new NotFoundCommunicationException("Некорректный способ связи.");
    }
}
