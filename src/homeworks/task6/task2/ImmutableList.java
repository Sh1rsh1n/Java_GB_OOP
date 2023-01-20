package homeworks.task6.task2;

public class ImmutableList<T> extends BaseList{
    
    public ImmutableList(List<T> list) {
        super(list);
    }
    
    @Override
    public void getSize() {
        System.out.println("Размер неизменяемой коллекции: %d", list.size());
    }
    
    @Overrid
    public void get(int index){
        System.out.printf("Элемент неизменяемой коллекции по индексу %d: %s", index, list.get(index));
        
        
    }
}