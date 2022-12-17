

/*
Имеются данные о группе студентов. У каждого студента есть средний балл (например, 4.6).
Создайте родительский класс ЗаписывательВФайл. Создайте три детских класса, которые записывают в файл информацию о студентах в разных формах:
Просто текст:
Иван Иванов=4.8
Мария Кузнецова=5.0
Степан Кузьмин=3.6
JSON:
{
"Иван Иванов": 4.8,
"Мария Кузнецова": 5.0,
"Степан Кузьмин": 3.6
}
XML:
<?xml version="1.0" encoding="utf-8" ?>
<students>
<student>
<name>Иван Иванов</name>
<grade>4.8</grade>
</student>
<student>
<name>Мария Кузнецова</name>
<grade>5.0</grade>
</student>
<student>
<name>Степан Кузьмин</name>
<grade>3.6</grade>
</student>
</students>
	*/

public class Main{

    public static void main(String args[]){
	List<Student> listStudents = new ArrayList<>();
	listStudents.add(new Student("Антон", "Иванов", 4.5));
	listStudents.add(new Student("Анна", "Попова", 4.7));
       listStudents.add(new Student("Кирилл", "Кузьмин", 3.8));
	listStudents.add(new Student("Петр", "Попов", 3.5));
	listStudents.add(new Student("Дмитрий", "Козлов", 4.2));
	
	
    }
}



