public class WithoutPasswordUnlocker implements PhoneUnlocker{
    
    @Override
    public void unlock(){
        System.out.println("Телефон разблокирован с помощью WithoutPassword");
    }
}