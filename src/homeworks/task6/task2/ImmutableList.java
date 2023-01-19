public class ImmutableList<T extends Collection> implements List{

    private final T array;
    
    public ImmutableList(Collection collection){
        array = collection;
    }

    @Override
    public void getSize(){
        System.out.printf("%d ", array.size)
    }
}