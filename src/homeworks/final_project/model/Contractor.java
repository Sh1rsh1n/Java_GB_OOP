package homeworks.final_project.model;

import homeworks.final_project.exception.IncorrectCommunicationTypeException;

import java.util.*;

/*
Класс - описание контрагента
@name - имя контрагента
@commsMap - список способов связи с контрагентом
 */
public class Contractor {

    private String name;
    private Map<String, List<String>> commsMap;

    public Contractor() {
        this.commsMap = new HashMap<>();
        this.commsMap.put("Phone", new ArrayList<>());
        this.commsMap.put("Email", new ArrayList<>());
        this.commsMap.put("Telegram", new ArrayList<>());
        this.commsMap.put("VKontakte", new ArrayList<>());
        this.commsMap.put("Address", new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, List<String>> getCommsMap() {
        return commsMap;
    }

    /*
    Добавление способа связи
     */
    public void setCommsMap(String comm) {
        String key = checkCommunicationType(comm); // проверяем корректность ввода значения и присвоили возвращаемое значение
        if (key == null) {  // если, вдруг, пришел null, кидаем и обрабатываем исключение
            try {
                throw new IncorrectCommunicationTypeException("Указан некорректный способ связи");
            } catch (IncorrectCommunicationTypeException e) {
                e.printStackTrace();
            }
        } else {
            commsMap.get(key).add(comm);    // добавляем значение в список по указанному ключу
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Имя контрагента: %s\n", this.name));
        sb.append("\tСпособы связи:\n");
        for (Map.Entry<String, List<String>> entry : commsMap.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                sb.append(String.format("%10s:", entry.getKey()));
                for (String com : entry.getValue()) {
                    sb.append(String.format("\t%s", com));
                }
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /*
    проверка корректности ввода данных способа связи,
    возвращает "ключ", по которому будет добавлено значение в список
     */
    public String checkCommunicationType(String comm) {
        if (comm.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
            return "Phone";
        if (comm.matches("\\d{11}"))
            return "Email";
        if (comm.matches("^[@]\\w+"))
            return "Telegram";
        if (comm.matches("^https://vk.com/[a-z0-9]+"))
            return "VKontakte";
        if (comm.matches("\\w+[-]\\d+")) {
            return "Address";
        }
        return null;

    }
}