package homeworks.final_project.data_handler;

import homeworks.final_project.model.Contractor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/*
Класс DataWriter, запись данных в файл
 */
public class DataWriter implements Data{

    /*
    метод записывает данные в файл
     */
    public static void dataWrite(Contractor contractor) {
    
        try (FileWriter writer = new FileWriter(path, true)) { // записываем данные в файл, с добавлением с новой строки
            writer.write(contractor.getName()); // записываем имя
            writer.write(",");
            for (Map.Entry<String, List<String>> entry: contractor.getCommsMap().entrySet()) { // получаем отображение
                if (entry.getValue() != null) { // если список не пустой, проходим по нему и записываем все данные
                    for (String com : entry.getValue()){
                        writer.write(com);
                        writer.write(",");
                    }
                }
            }
            writer.write("\n");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    метод, удаляет контрагента из списка, который получаем из файла и перезаписываем данные
     */
    public static void removeData(String name) {
        List<Contractor> list = DataReader.read();
        for (Contractor contractor: list) {
            if (contractor.getName().equalsIgnoreCase(name)) {
                list.remove(contractor);
                DataWriter.reWriteData(list);
                return;
            }
        }
    }

    /*
    метод, перезаписывает данные в файл
     */
    public static void reWriteData(List<Contractor> list) {
        try (FileWriter writer = new FileWriter(path, false)) { // перезапись данных в файл
            for (Contractor contractor: list) {
                writer.write(contractor.getName());
                writer.write(",");
                for (Map.Entry<String, List<String>> entry: contractor.getCommsMap().entrySet()) {
                    if (entry.getValue() != null) {
                        for (String com : entry.getValue()){
                            writer.write(com);
                            writer.write(",");
                        }
                    }
                }
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
