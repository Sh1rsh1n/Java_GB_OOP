package homeworks.task6.task2;

public abstract class BaseList<T> implements CustomList{
    
    private List<T> list;
    
    public ImmutableList(List<T> list) {
        this.list = new ArrayList(list);
    }
    
    public abstract void getSize();
    
    public abstract void get(int index);
    
}