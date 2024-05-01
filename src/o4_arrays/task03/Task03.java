package o4_arrays.task03;

/**
 * Цель: Вернуть середину массива
 * <p>
 * Что нужно знать:
 * <p>
 * 1. Массивы
 * 2. Условные операторы
 * 3. Циклы
 * <p>
 * Задание:
 * Дан массив произвольной длины. Необходимо вернуть центральную часть массива, при чем, если массив четной длины, то вернуть массив из двух элементов, если нечетной, то вернуть массив из одного элемента.
 * <p>
 * Пример ввода: {1, 5, 2, 17}
 * Пример вывода: [5, 2]
 * <p>
 * Пример ввода: {14, 16, 3}
 * Пример вывода: [16]
 * <p>
 * Пример ввода: {}
 * Пример вывода: []
 * <p>
 * Требования:
 * Метод должен быть public static
 * Сигнатура метода getArrayMiddle(int[] numbers)
 * Не использовать Arrays, System.arrayCopy
 */
public class Task03 {
    public static void main(String[] args) {
        System.out.println(getArrayMiddle(new int[]{1, 2, 3, 4, 5}));

    }

    public static String getArrayMiddle(int[] numbers) {
        String res = "";
        if (numbers.length > 2) {
            if (numbers.length % 2 == 0) {
                int[] arr = new int[2];
                arr[0] = numbers[numbers.length / 2 - 1];
                arr[1] = numbers[numbers.length / 2];
                for (int i = 0; i < arr.length - 1; i++) {
                    res = arr[i] + ", ";
                }
                int last = arr[arr.length - 1];
                return res + last;
            } else {
                int[] arr1 = new int[1];
                arr1[0] = numbers[numbers.length / 2];
                for (int i = 0; i < arr1.length - 0; i++) {
                    res = arr1[i] + "";
                    return res;
                }
            }
        }
        return res;
    }
}

