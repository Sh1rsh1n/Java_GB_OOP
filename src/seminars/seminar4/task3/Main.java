package seminars.seminar4.task3;

/*
Напишите обобщённую функцию сортировки. Она может отсортировать массив любого типа T.
Любые ли типы можно сортировать? Какие ограничения надо наложить на тип T?

Отсортируйте несколько массивов разных типов с помощью этой функции.
Можно ли отсортировать массив примитивных типов?
 */
public class Main {
    public static void main(String[] args) {
        String[] arr = {"eabc", "abd", "bcd", "ace"};

        for (String str: arr) {
            System.out.println(str);
        }
        System.out.println();
        sortArray(arr);

        for (String str: arr) {
            System.out.println(str);
        }

    }

    private static <T extends Comparable<T>> void sortArray(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
