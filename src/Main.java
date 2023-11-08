import java.util.Scanner;
/**Метод сортировки Чётное-Нечетное.
 * Является модификацией пузырьковой сортировкой. Сортировка состоит их двух вложенных внутренних циклов в один внешний.
 * В одном идет сортировка элементов с чётными индексами, в другом - нечетными.
 * Удобен в многопоточных приложениях. Сортировку можно делать в двух потоках.*/
public class Main {
    public static void main(String[] args) {
        OddEvenSort oddEvenSort;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int size = sc.nextInt();
        oddEvenSort = new OddEvenSort(size);
        System.out.println("Создан следующий массив: ");
        oddEvenSort.display();
        oddEvenSort.oddEvenSort();
        System.out.println("Массив отсортирован:");
        oddEvenSort.display();
    }
}
