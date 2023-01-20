package homeworks.task6.task2;

import java.util.ArrayList;
import java.util.List;

public class MutableList<T> extends BaseList{
    private List<T> list;

    public MutableList(List<T> list) {
        this.list = new ArrayList<>(list);
    }

    @Override
    public void getSize() {
        System.out.printf("Размер изменяемой коллекции: %d\n", list.size());
    }

    @Override
    public void get(int index) {
        System.out.printf("Элемент изменяемой коллекции по индексу %d: %s\n", index, list.get(index));
    }
    
    public void set(int index, T value) { 
        list.set(index, value);
        System.out.printf("Успешное изменение элемента с индексом: %d на значение: %s\n", index, value);
    }
    
    public void add(T value){
        list.add(value);
        System.out.printf("Успешное добавление элемента: %s\n", value);
    }
    
    public void remove(T value){
        list.remove(value);
        System.out.printf("Успешное удаление элемента: %s\n", value);
    }
}
