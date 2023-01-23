package homeworks.final_project.model;

import java.util.*;

public class Contractor {

    private String name;
    private Map<String, List<String>> map;

    public Contractor(String name) {
        this.name = name;
        this.map = new HashMap<>();
        this.map.put("Phone", new ArrayList<>());
        this.map.put("Email", new ArrayList<>());
        this.map.put("Telegram", new ArrayList<>());
        this.map.put("VKontakte", new ArrayList<>());
        this.map.put("Address", new ArrayList<>());
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Map<String, List<String>> getMap(){
        return map;
    }
    
    public void setMap(String comm){
        String key = checkCommunicationType(String communication);
        if (map.containsKey(key) && !map.get(key).isEmpty()){
            map.get(key).add(comm);
        } else if (key == null){
            return;
        } else {
            map.get(key).add(comm);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<String>> entry: map.entrySet()){
            sb = String.format("Имя контрагента: %s\n", entry.getKey());
            sb = "\tСпособы связи:\n" 
            if (!entry.getValue().isEmpty()) {
                for (String com: entry.getValue()){
                    sb = String.format("\t\t%s\n", com);
                }
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
