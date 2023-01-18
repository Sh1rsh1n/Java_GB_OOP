package homeworks.task6.task1;

public class FaceIDUnlocker implements PhoneUnlocker{
    
    @Override
    public void unlock(){
        System.out.println("Телефон разблокирован с помощью FaceID"); 
    }
}