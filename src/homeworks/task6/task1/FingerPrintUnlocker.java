package homeworks.task6.task1;

public class FingerPrintUnlocker implements PhoneUnlocker{
    
    @Override
    public void unlock(){
        System.out.println("Телефон разблокирован с помощью FingerPrint");
    }
}