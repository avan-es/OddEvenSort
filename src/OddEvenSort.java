import java.util.concurrent.ThreadLocalRandom;

public class OddEvenSort {

    private int[] array;

    OddEvenSort(int size) {
        this.array = new int[size];
        for (int i = 0; i < size; i++) {
            this.array[i] = ThreadLocalRandom.current().nextInt(-100000, 100000);
        }
    }

    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Индекс [" + i + "]: " + array[i]);
        }
    }

    //Чет-Нечет сортировка
    public void oddEvenSort() {
        int temp;
        //Флаг о состоянии массива: является ли он отсортированным
        boolean isSorted = false;
        //До тех пор, пока флаг выполняет условие !false
        while (!isSorted) {
            //Меняем флаг на true, если, после прохода по телу цикла, флаг останется true, то условие внешнего цикла
            //перестаёт быть истинным и сортировка окончена. Все элементы отсортированы
            isSorted = true;
            //В этом цикле сортируем четные элементы
            for (int i = 0; i <= array.length - 2; i = i + 2) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    //Если была хоть одна перестановка - менем флаг на false, чтобы внешний цикл продолжался
                    isSorted = false;
                }
            }
            //В этом цикле сортируем нечетные элементы
            for (int i = 1; i <= array.length - 2; i = i + 2) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    //Если была хоть одна перестановка - менем флаг на false, чтобы внешний цикл продолжался
                    isSorted = false;
                }
            }
        }
    }
}
