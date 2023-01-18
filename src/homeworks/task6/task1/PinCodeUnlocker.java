package homeworks.task6.task1;

public class PinCodeUnlocker implements PhoneUnlocker{
    
    @Override
    public void unlock(){
        System.out.println("Телефон разблокирован с помощью PinCode");
    }
}