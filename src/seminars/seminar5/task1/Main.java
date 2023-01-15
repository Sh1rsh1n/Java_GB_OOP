package seminars.seminar5.task1;

import seminars.seminar5.task1.model.Student;
import seminars.seminar5.task1.service.StudentService;
import seminars.seminar5.task1.ui.StudentView;
import seminars.seminar5.task1.util.DataReader;
import java.util.List;

/*
Создайте три класса в пакете data: User, Teacher, Student. User содержит поля, общие для студента и преподавателя. Student и Teacher добавляют поля, специфичные для этих классов. Из соображений времени не делайте класс Teacher и связанные с ним классы.
Создайте два класса в пакете util: DataWriter и DataReader. Они позволяют сохранить в файл коллекцию студентов и преподавателей, а также загрузить их из файлов.
Создайте в пакете service: интерфейс DataService и два детских класса: StudentService и TeacherService. Сервис скрывает в себе коллекцию объектов. Интерфейс содержит операции:
добавить нового студента или учителя
сохранить всех в файл
загрузить всех из файла

Создайте класс StudentView, который позволяет распечатать студентов из объекта StudentService.

 */
public class Main {
    public static void main(String[] args) {

        new StudentView(new StudentService()).showStudents();


    }
}
