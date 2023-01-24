package homeworks.final_project.ui;

import homeworks.final_project.exceptions.NotFoundCommunicationException;
import homeworks.final_project.service.DataService;

public class GetContractorInfo implements BaseMenu{

    @Override
    public void showMenu(DataService service) {
          Scanner scanner = new Scanner(System.in);
          
          while (true) {
               System.out.println("Меню информации о контрагентах.\n" +
                    "Введите цифру, нужного действия:\n" +
                    "1. Показать информацию о всех контрагентах.\n" +
                    "2. Показать информацию о контрагенте.\n" +
                    "3. Вернуться в предыдущее меню.\n" +
                    "0. Выйти из программы.");
               System.out.print(">>>\t");
               String input = scanner.next();

               if (input.equals("1")) {
                    List<Contractor> list = service.getAllContractorsName();
                    System.out.println("Список всех контрагентов по именам:")
                    for (Contractor contractor : list) {
                         System.out.printf("\t%s", contractor.getName());
               }
               
               if (input.equals("2")) {
                    List<Contractor> list = service.getAllContractorsName();
                    while (true) {
                         System.out.println("Введите имя контрагента:");
                         System.out.print(">>>\t");
                         input = scanner.next();
                    
                         for (Contractor contractor : list) {
                              if (contractor.getName().equalsIgnoreCase(input)) {
                                   System.out.println(contractor);
                              }
                         }
                         System.out.println("Показать информацию о другом контрагенте?\nВведите \"Y\" - получить информацию.\nВведите любой символ чтобы вернуться в меню выбора.\n");
                         System.out.print(">>>\t");
                         input = scanner.next();

                         if (input.equalsIgnoreCase("Y")) {
                              continue;
                         }
                         break;
                    }
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
}
