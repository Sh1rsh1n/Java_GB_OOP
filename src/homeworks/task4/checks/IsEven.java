package homeworks.task4.checks;


public class IsEven implements IsGood<Integer>{

    @Override
    public boolean isGood(Integer item) {
        return item % 2 == 0;
    }
}
