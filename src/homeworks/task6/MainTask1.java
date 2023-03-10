package homeworks.task6;

import homeworks.task6.task1.*;

public class MainTask1{
    public static void main(String[] args){

        PhoneUnlocker[] phoneUnlockers = {new FaceIDUnlocker(), new PinCodeUnlocker(), new FingerPrintUnlocker(), new WithoutPasswordUnlocker()};

        for (PhoneUnlocker unlocker: phoneUnlockers) {
            new MyPhone(unlocker).getPhoneUnlocker().unlock();
            System.out.println("******************************");
        }
    }
}