package homeworks.task4.checks;

public class BeginsWithA implements IsGood<String> {

    @Override
    public boolean isGood(String item) {
        return item.startsWith("A");
    }
}
