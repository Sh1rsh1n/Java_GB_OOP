public class MyPhone{
    
    private PhoneUnlocker phoneUnlocker;
    
    public MyPhone(PhoneUnlocker phoneUnlocker){
        System.out.println("Разблокировка телефона");
        this.phoneUnlocker = phoneUnlocker;
    }
    
    public PhoneUnlocker getPhoneUnlocker(){
        return phoneUnlocker;
    }
}