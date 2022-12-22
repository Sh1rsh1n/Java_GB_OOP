package homeworks.task3;

import homeworks.task3.iter.GroupListIterator;
import homeworks.task3.iter.StudentGroup;


import java.util.Arrays;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        StudentGroup studentGroup = new StudentGroup(Arrays.asList(
                new Student("Alex", "Popov", 4.2f),
                new Student("Dasha", "Ivanova", 3.9f),
                new Student("Oleg", "Smirnov", 4.8f)));

        ListIterator<Student> groupListIterator = studentGroup.listIterator(0);

        while (groupListIterator.hasNext()) {
            System.out.println(groupListIterator.next());
        }
    }
}



