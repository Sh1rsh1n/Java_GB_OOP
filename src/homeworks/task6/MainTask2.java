package homeworks.task6;

import homeworks.task6.task2.ImmutableList;
import homeworks.task6.task2.MutableList;

import java.util.ArrayList;
import java.util.List;

public class MainTask2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Bicycle");
        list.add("Bike");
        list.add("Car");
        list.add("Minivan");
        list.add("Bus");
        list.add("Plain");
        list.add("Train");
        
        ImmutableList<String> immList = new ImmutableList<>(list);
        immList.getSize();
        immList.get(2);
        System.out.println("**********************************");
        int count = 0;
        for (Object st: immList.getList()) {
            System.out.printf("%d. %s\n", count++, (String) st);
        }
        System.out.println("**********************************");
        
        
        MutableList<String> mutList = new MutableList<>(list);
        mutList.getSize();
        mutList.get(1);
        mutList.set(1, "SuperBike");
        mutList.get(1);
        mutList.add("Boat");
        mutList.remove("Car");
        System.out.println("**********************************");
        count = 0;
        for (Object st: mutList.getList()) {
            System.out.printf("%d. %s\n", count++, (String) st);
        }
        System.out.println("**********************************");
    }
}
