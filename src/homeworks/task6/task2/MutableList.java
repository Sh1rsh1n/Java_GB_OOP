package homeworks.task6.task2;

public class MutableList<T> extends BaseList{
    
    public MutableList(List<T> list) {
        super(list);
    }

    @Override
    public void getSize() {
        System.out.println("Размер изменяемой коллекции: %d", list.size());
    }

    @Override
    public void get(int index) {
        System.out.printf("Элемент изменяемой коллекции по индексу %d: %s", index, list.get(index));
    }
    
    public void set(int index, T value) { 
        list.set(index, value);
        System.out.println("Успешное изменение элемента");
    }
    
    public void add(T value){
        list.add(value);
        System.out.println("Успешное добавление элемента");
    }
    
    public void remove(T value){
        list.remove(value);
        System.out.println("Успешное удаление элемента");
    }
}
