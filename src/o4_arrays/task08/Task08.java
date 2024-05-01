package o4_arrays.task08;

import java.util.Arrays;

/**
 * Цель: Слить два произвольных массива в один отсортированный
 *
 * Что нужно знать:
 *
 * 1. Массивы
 * 2. Циклы
 * 3. Условные операторы
 *
 * Задание:
 * Реализовать метод mergeAndSort(int[] firstArray, int[] secondArray), который принимает, соединяет и сортирует два произвольных массива чисел
 *
 *
 * Пример ввода: {1, 3, 7, 5}, {8, 4, 2, 4}
 * Пример вывода: [1, 2, 3, 4, 4, 5, 7, 8]
 *
 * Пример ввода: {} {1, 4, 3}
 * Пример вывода: [1, 3, 4]
 *
 * Требования:
 * метод должен быть public static
 * сигнатура метода mergeAndSort(int[] firstArray, int[] secondArray)
 */
public class Task08 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeAndSort(new int[] {1,3,7,5}, new int[] {8,4,2,4})));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
       int[] sum = new int[firstArray.length + secondArray.length];
       int a = 0;
       for (int i = 0; i < firstArray.length; i++) {
           sum [i] = firstArray[i];
           a++;
       }
       for (int i : secondArray) {
           sum[a++] = i;
       }
       Arrays.sort(sum);
       return sum;
    }
}
