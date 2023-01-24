package homeworks.final_project.ui;

import homeworks.final_project.service.DataService;

import java.util.Scanner;

public class CommunicationMenu implements BaseMenu {

    @Override
    public void showMenu(DataService service) {
          List<Contractor> list = DataReader.read();
          Scanner scanner = new Scanner(System.in);
          
          while (true) {
               System.out.println("Меню добавления и удаления способа связи контрагенту.\n" +
                    "Введите цифру, нужного действия:\n" +
                    "1. Добавить способ связи.\n" +
                    "2. Удалить способ связи.\n" +
                    "3. Вернуться в предыдущее меню.\n" +
                    "0. Выйти из программы.");
               System.out.print(">>>\t");
               String input = scanner.next();
          
               if (input.equals("1")) {
                    while (true) {
                         System.out.println("Введите имя контрагента:");
                         System.out.print(">>>\t");
                         String name = scanner.next();
                    
                         System.out.println("Введите имя способ связи:");
                         System.out.print(">>>\t");
                         String comm = scanner.next();
                    
                         service.addCommunicationToContractor(name, comm);
                         
                         System.out.println("Хотите удалить еще один способ связи?\nВведите \"Y\" - повторить действие.\nВведите любой символ чтобы завершить удаление способов связи.\n");
                         System.out.print(">>>\t");
                         input = scanner.next();

                         if (in.equalsIgnoreCase("Y")) {
                              contractor.setCommsMap(input);
                              continue;
                         }
                         break;
                    } 
               }
               
               if (input.equals("2")) {
                    System.out.println("Введите имя контрагента:");
                    System.out.print(">>>\t");
                    String name = scanner.next();
                    
                    System.out.println("Введите имя способ связи:");
                    String comm = chioceCommunication();
                    
                    service.removeCommunicationToContractor(name, comm);
                    
                    
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
    
    private String chioceCommunication() {
          System.out.println("1. Телефон\n2. Электронная почта\n3. ВКонтакте\n4. Telegram\n5. Адрес нахождения\n");
          System.out.print(">>>\t");
          String input = scanner.next();
          if (input.equals("1")) return "Phone";
          if (input.equals("2")) return "Email";
          if (input.equals("3")) return "VKontakte";
          if (input.equals("4")) return "Telegram";
          if (input.equals("5")) return "Address";
          return "";
    }
}
