package o4_arrays.task05;

/**
 * Цель: Слить два произвольных массива в один отсортированный
 * <p>
 * Что нужно знать:
 * <p>
 * 1. Массивы
 * 2. Циклы
 * 3. Условные операторы
 * <p>
 * Задание:
 * Реализовать метод mergeAndSort(int[] firstArray, int[] secondArray), который принимает, соединяет и сортирует два произвольных массива чисел
 * <p>
 * <p>
 * Пример ввода: {1, 3, 7, 5}, {8, 4, 2, 4}
 * Пример вывода: [1, 2, 3, 4, 4, 5, 7, 8]
 * <p>
 * Пример ввода: {} {1, 4, 3}
 * Пример вывода: [1, 3, 4]
 * <p>
 * Требования:
 * метод должен быть public static
 * сигнатура метода mergeAndSort(int[] firstArray, int[] secondArray)
 * Не использовать Arrays.
 */
public class task05 {
    public static void main(String[] args) {
        System.out.println(mergeAndSort(new int[]{3,5,10,17}, new int[]{1,50,7,35,0}));
    }

    public static String mergeAndSort(int[] firstArray, int[] secondArray) {
        String sum = "";
        int[] result = new int[firstArray.length + secondArray.length];
        int n = firstArray.length;
        int m = secondArray.length;
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (firstArray[i] <= secondArray[j]) {
                result[k] = firstArray[i];
                i++;
            } else {
                result[k] = secondArray[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            result[k] = firstArray[i];
            i++;
            k++;
        }
        while (j < m) {
            result[k] = secondArray[j];
            j++;
            k++;
        }
        for (int d = 0; d < result.length; d++) {
            int min = result[d];
            int min_d = d;
            for (int y = d + 1; y < result.length; y++) {
                if (result[y] < min) {
                    min = result[y];
                    min_d = y;
                }
            }
            if (d != min_d) {
                int tmp = result[d];
                result[d] = result[min_d];
                result[min_d] = tmp;
            }
        }
        for (int u = 0; u < result.length - 1; u++) {
            sum = sum + result[u] + ", ";
        }

        int last = result[result.length - 1];
        return "[" + sum + last + "]";
    }
}