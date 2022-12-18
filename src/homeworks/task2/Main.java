package homeworks.task2;

import java.lang.reflect.Field;

import homeworks.task2.writerPatterns.WriteTo;
import homeworks.task2.writerPatterns.WriteToText;

import java.util.*;

public class Main {
	
	private static void writeTo(List<Student> list) {
		StringBuilder sb = new StringBuilder();
		
		Iterator<Student> iter = list.iterator();
		
		sb.append("{\n");
		while(iter.hasNext()) {
			Student st = iter.next();
			sb.append(String.format("\"%s %s\": %s",st.getName(), st.getSurname(), st.getAvgGrade()));
			if (iter.hasNext()) {
				sb.append(",\n");
			}
		}
		sb.append("\n}");
		
		System.out.println(sb.toString());
	}
	
	private static void writeToXML(List<Student> list) {
		StringBuilder sb = new StringBuilder();
		
		Iterator<Student> iter = list.iterator();
		
		Class myClass = Student.class;
		Field[] fields = myClass.getDeclaredFields();
		
		String className = myClass.getName().toLowerCase();
		String name = fields[0].getName().toLowerCase();
		String surname = fields[1].getName().toLowerCase();
		String avgGrade = fields[2].getName().toLowerCase();
		
		sb.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");
		sb.append(String.format("<%ss>", className));
		while(iter.hasNext()) {
			Student st = iter.next();
			sb.append(String.format("\n\t<%s>\n", className));
			sb.append(String.format("\t\t<%s>%s</%s>\n", name, st.getName(), name));
			sb.append(String.format("\t\t<%s>%s</%s>\n", surname, st.getSurname(), surname));
			sb.append(String.format("\t\t<%s>%s</%s>\n", avgGrade, st.getAvgGrade(), avgGrade));
			sb.append(String.format("\t</%s>", className));
		}
		sb.append(String.format("\n<%ss>", className));
		
		System.out.println(sb.toString());
	}
	
    public static void main(String[] args) {
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student("Антон", "Иванов", 4.5f));
        listStudents.add(new Student("Анна", "Попова", 4.7f));
        listStudents.add(new Student("Кирилл", "Кузьмин", 3.8f));
        listStudents.add(new Student("Петр", "Попов", 3.5f));
        listStudents.add(new Student("Дмитрий", "Козлов", 4.2f));

        //WriteTo writeTo = new WriteToText(listStudents);
        //writeTo.write();
		
	writeTo(listStudents);
	System.out.println();
	writeToXML(listStudents);
    }
}

class Student {
    private String name;
    private String surname;
    private float avgGrade;

    public Student(String name, String surname, float avgGrade) {
        this.name = name;
        this.surname = surname;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public float getAvgGrade() {
        return avgGrade;
    }
}
