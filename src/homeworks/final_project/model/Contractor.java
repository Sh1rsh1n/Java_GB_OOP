package homeworks.final_project.model;
import homeworks.final_project.model.communications.Communication;

import java.util.ArrayList;
import java.util.List;

public class Contractor {

    private String name;
    private List<Communication> list;

    public Contractor(String name, List<Communication> list) {
        this.name = name;
        this.list = new ArrayList<>(list);
    }

    public String getName() {
        return name;
    }

    public List<Communication> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
