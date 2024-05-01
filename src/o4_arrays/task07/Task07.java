package o4_arrays.task07;


import java.util.Arrays;

/**
 * Цель: Вернуть середину массива
 * <p>
 * Что нужно знать:
 * <p>
 * 1. Массивы
 * 2. Класс Arrays.
 * <p>
 * Задание:
 * <p>
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
 * Использовать Arrays или System.arrayсopy
 */
public class Task07 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArrayMiddle(new int[]{1, 2, 3, 4, 5, 6})));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        String res = "";
        int left = (numbers.length - 1) / 2;
        int right = numbers.length == 0 ? 0 : left + 2 - numbers.length % 2;
        res = res + numbers;
        return Arrays.copyOfRange(numbers, left, right);
    }
}

