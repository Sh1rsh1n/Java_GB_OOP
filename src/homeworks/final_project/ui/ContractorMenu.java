package homeworks.final_project.ui;

import homeworks.final_project.model.Contractor;
import homeworks.final_project.service.DataService;

import java.util.Scanner;

/*
класс выводит интерфейс для добавления/удаления контрагента
 */
public class ContractorMenu implements BaseMenu {

    @Override
    public void showMenu(DataService service) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Меню добавления и удаления контрагента\n" +
                    "Введите цифру, нужного действия:\n" +
                    "1. Добавить контрагента.\n" +
                    "2. Удалить контрагента.\n" +
                    "3. Вернуться в предыдущее меню.\n" +
                    "0. Выйти из программы.");
            System.out.print(">>>\t");
            String input = scanner.next();

            if (input.equals("1")) {
                Contractor contractor = new Contractor();

                System.out.println("Введите имя контрагента:");
                System.out.print(">>>\t");
                String name = scanner.next();
                contractor.setName(name);

                while (true) {
                    System.out.println("Добавьте способ связи:\n" +
                            "Электронная почта: user@gmail.com\n" +
                            "Телефон: +79876543210\n" +
                            "Telegram: @user\n" +
                            "ВКонтакте: https://vk.com/username\n" +
                            "Адрес нахождения: Tverskaya-10");
                    System.out.print(">>>\t");
                    String comm = scanner.next();
                    contractor.setCommsMap(comm);

                    System.out.println("Хотите добавить еще один способ связи?\nВведите \"Y\" - добавить ещё способ связи.\nВведите любой символ чтобы завершить добавление контрагента.\n");
                    System.out.print(">>>\t");
                    input = scanner.next();

                    if (input.equalsIgnoreCase("Y")) {
                        contractor.setCommsMap(input);
                        continue;
                    }
                    break;
                }

                service.addContractor(contractor);

                System.out.printf("Контрагент %s успешно добавлен.\n\n", name);
                break;
            }
            if (input.equals("2")) {
                System.out.println("Введите имя контрагента:");
                System.out.print(">>>\t");
                String name = scanner.next();
                service.removeContractor(name);
                System.out.printf("Контрагент %s успешно удален\n", name);
                break;
            }
            if (input.equals("3")) {
                System.out.println("Выход в предыдущее меню.");
                break;
            }
            if (input.equals("0")) {
                System.out.println("Выход из программы.");
                return;
            }
            System.out.println("Некорректный ввод, попробуйте еще раз.");
        }
    }
}
