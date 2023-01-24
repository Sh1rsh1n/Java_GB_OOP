package homeworks.final_project.data_handler;

import homeworks.final_project.model.Contractor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/*
Класс DataReader, чтения данных из файла
 */
public class DataReader implements Data{

    /*
    метод, читает данные из файла
     */
    public static List<Contractor> read() {
        List<Contractor> list = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {    // читаем данные из файла
            String str;
            while ((str = bf.readLine()) != null) {

                String[] array = str.split(",");    // разбиваем полученную строку на массив строк
                
                Contractor contractor = new Contractor();
                contractor.setName(array[0]);   // указываем имя контрагента
                if (array.length > 1){ 
                    for (int i = 1; i < array.length; i++) {
                        contractor.getCommsMap().get(contractor.checkCommunicationType(array[i])).add(array[i]);   // проверяем и добавляем, по типам способов связи, значения в списки.
                    }
                }
                list.add(contractor);   // добавляем контрагента в список
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
