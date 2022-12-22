



/*
- Класс Группа содержит в себе коллекцию Студентов. По группе можно перемещаться с помощью итератора. (Это повторяет 1-ю задачу из классной работы). Остальные задачи надстраиваются поверх неё.
- Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях. Он реализует интерфейс ListIterator<Student>.
- Добавьте в Группу метод listIterator (), который позволяет начать итерацию с помощью GroupListIterator.
- Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
• Он отслеживает текущую позицию в переборе
• Он изначально выставлен на конечную позицию
• Он движется справа налево
Проверьте, как он работает.
*/
public class Main{

    public static void main(String args[]){

        
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
	
	@Override
	public String toString() {
		return String.format("Student {name: %s, surname: %s, avgGrade: %s}", name, surname, avgGrade);
	}
}



class Group implements Iterable<Student>{
	private List<Student> list;
	
	public Group(List<Student> list) {
		this.list = list;
	}
	
	public int studentAmount() {
		return list.size();
	}
	
	public Student getStudent(int index) {
		return list.get(index);
	}
	
	public Iterator<Student> listIterator(int index) {
		return list.iterator(index);
	}
	
	public Iterator<Student> listIterator() {
		return list.iterator();
	}
}


class GroupListIterator implements ListIterator<Student> {
	
	private int index = 0;

	private Group group;
	
	public GroupListIterator(Group group) {
		this.group = group;
	}
	
	public boolean hasNext() {
		return index < group.studentAmount();
	}
	
	public Student next() {
		return group.getStudent(index++);
	}
	
	public boolean hasPrevious() {
		return index > 0;
	}
	
	public Student previous() {
		return group.getStudent(index--);
	}
	
	
	
}