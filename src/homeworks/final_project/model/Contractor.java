package homeworks.final_project.model;

import java.util.*;

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

    public void setCommsMap(String comm) {
        String key = checkCommunicationType(comm);
        if (commsMap.containsKey(key) && !commsMap.get(key).isEmpty()) {
            commsMap.get(key).add(comm);
        } else if (key == null) {

        } else {
            commsMap.get(key).add(comm);
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

    private String checkCommunicationType(String comm) {
        if (comm.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
            return "Phone";
        if (comm.matches("(\\+*)\\d{11}"))
            return "Email";
        if (comm.matches(".*\\B@(?=\\w{5,64}\\b)[a-zA-Z0-9]+(?:_[a-zA-Z0-9]+)*.*"))
            return "Telegram";
        if (comm.matches("^https://vk.com/[a-z0-9]+"))
            return "VKontakte";
        if (comm.matches("\\w+[-]\\d+")) {
            return "Address";
        }
        return null;

    }
}