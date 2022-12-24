package seminars.seminar4.task2;

/*
Напишите самодельный обобщённый класс Collection, внутри которого спрятан массив.
Используйте обобщения, чтобы класс мог хранить данные произвольного типа, например,
Collection<Integer> или Collection<String>. Обязательные операции, которые надо прописать:

get: достаёт элемент по указанному индексу
set: перезаписывает элемент по указанному индексу
size: сколько элементов в массиве?
toString

(Необязательная часть, если есть время). Пропишите операцию add, которая делает динамическое перевыделение массива и добавляет новый элемент в конец.
 */
public class Main {
    public static void main(String[] args) {
        CustomList<Integer> customList = new CustomList<>();
        customList.add(1);
        customList.add(1);
        customList.add(1);


        System.out.println(customList);

    }
}
