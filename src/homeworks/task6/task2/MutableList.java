package homeworks.task6.task2;

import java.util.List;

public class MutableList<T> extends BaseList{
    public MutableList(List list) {
        super(list);
    }

    public void set(int index, T value) {
        getList().set(index, value);
        System.out.printf("Успешное изменение элемента с индексом: %d на значение: %s\n", index, value);
    }
    
    public void add(T value){
        getList().add(value);
        System.out.printf("Успешное добавление элемента: %s\n", value);
    }
    
    public void remove(T value){
        getList().remove(value);
        System.out.printf("Успешное удаление элемента: %s\n", value);
    }
}
