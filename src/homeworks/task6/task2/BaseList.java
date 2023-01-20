package homeworks.task6.task2;

import java.util.ArrayList;
import java.util.List;

public class BaseList<L> implements CustomList{

    private List<L> list;

    public BaseList(List<L> list) {
        this.list = new ArrayList<>(list);
    }

    public List<L> getList() {
        return list;
    }

    public int getSize(){
        System.out.printf("Размер коллекции: %d\n", list.size());
        return list.size();
    }
    public L get(int index){
        System.out.printf("Элемент с  индексом: %d -> %s\n", index, list.get(index));
        return list.get(index);
    }
    
}