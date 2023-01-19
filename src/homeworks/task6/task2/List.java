package homeworks.task6.task2;

public class List<T extends java.util.List> {

    private T list;

    public List(T list) {
        this.list = list;
    }

    public int getSize() {
        return list.size();
    }

    public T get(int index) {
        return (T) list.get(index);
    }
}