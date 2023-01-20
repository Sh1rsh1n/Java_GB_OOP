package homeworks.task6.task2;

import java.util.ArrayList;
import java.util.List;

public class ImmutableList<T> extends BaseList{
    private List<T> list;

    public ImmutableList(List<T> list) {
        this.list = new ArrayList<>(list);
    }

    @Override
    public void getSize() {
        System.out.printf("Размер неизменяемой коллекции: %d\n", list.size());
    }
    
    @Override
    public void get(int index){
        System.out.printf("Элемент неизменяемой коллекции по индексу %d: %s\n", index, list.get(index));
    }
}