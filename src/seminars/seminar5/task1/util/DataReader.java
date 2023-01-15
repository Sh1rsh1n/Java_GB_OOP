package seminars.seminar5.task1.util;

import seminars.seminar5.task1.model.Student;
import seminars.seminar5.task1.model.User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public static List<Student> dataRead(String path) {
        List<Student> list = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String str;
            while ((str = bf.readLine()) != null) {

                String[] array = str.split(", ");
//                for (String st: array) {
//                    System.out.println(st);
//                }
                list.add(new Student(array[0], array[1], Integer.parseInt(array[2]), Integer.parseInt(array[3]), Float.parseFloat(array[4])));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
