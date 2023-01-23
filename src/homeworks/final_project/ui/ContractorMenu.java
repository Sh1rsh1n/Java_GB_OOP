package homeworks.final_project.ui;

import homeworks.final_project.model.Contractor;
import homeworks.final_project.service.DataService;

import java.util.Scanner;

public class ContractorMenu implements BaseMenu {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void showMenu(DataService service) {
        while (true) {
            System.out.println("Меню создания и удаления контрагента\n" +
                    "Введите цифру, нужного действия:\n" +
                    "1. Добавить контрагента.\n" +
                    "2. Удалить контрагента.\n" +
                    "3. Вернуться в предыдущее меню.\n" +
                    "0. Выйти из программы.");
            System.out.print(">>>\t");
            int input = scanner.nextInt();

            if (input == 1) {
                Contractor contractor = new Contractor();

                System.out.println("Введите имя контрагента:");
                System.out.print(">>>\t");
                String addContractorName = scanner.next();
                contractor.setName(addContractorName);

                while (true) {
                    System.out.println("Добавьте способ связи:\n" +
                            "Электронная почта: user@gmail.com\n" +
                            "Телефон: +79876543210\n" +
                            "Telegram: @user\n" +
                            "ВКонтакте: https://vk.com/username\n" +
                            "Адрес нахождения: Tverskaya-10");
                    System.out.print(">>>\t");
                    String communication = scanner.next();
                    contractor.setCommsMap(communication);

                    System.out.println("Хотите добавить еще один способ связи?\nВведите \"Y\" - добавить ещё способ связи.\nВведите любой символ чтобы завершить добавление контрагента.\n");
                    System.out.print(">>>\t");
                    String in = scanner.next();

                    if (in.equalsIgnoreCase("Y")) {
                        contractor.setCommsMap(communication);
                        continue;
                    }
                    break;
                }

                service.addContractor(contractor);

                System.out.printf("Контрагент %s успешно добавлен.\n\n", addContractorName);
                break;
            }
            if (input == 2) {
                System.out.println("Введите имя контрагента:");
                System.out.print(">>>\t");
                String removeContractorName = scanner.next();
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

//    private Communication checkCommunication(String comm) throws NotFoundCommunicationException {
//        if (comm.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
//            return new Email(comm);
//        if (comm.matches("(\\+*)\\d{11}"))
//            return new Phone(comm);
//        if (comm.matches(".*\\B@(?=\\w{5,64}\\b)[a-zA-Z0-9]+(?:_[a-zA-Z0-9]+)*.*"))
//            return new TelegramNikName(comm);
//        if (comm.matches("^https://vk.com/[a-z0-9]+"))
//            return new VK_URL(comm);
//        if (comm.matches("\\w+[-]\\d+")) {
//            return new Address(comm);
//        }
//        throw new NotFoundCommunicationException("Некорректный способ связи.");
//    }
}
