package o4_arrays.task06;

import java.util.Arrays;

/**
 * Цель: научиться выводить массив с его значениями в консоль.
 * <p>
 * Что нужно знать:
 * <p>
 * 1. методы класса System
 * 2. Arrays
 * <p>
 * Задание:
 * Реализуйте метод, который будет принимать массив чисел и выводить его значения в консоль c помощью методов класса Arrays
 * <p>
 * <p>
 * Пример ввода: {1,2,3,4,5,5,6,7,7}
 * Пример вывода: [1, 2, 3, 4, 5, 5, 6, 7, 7]
 * <p>
 * Пример ввода: {}
 * Пример вывода: []
 * <p>
 * Требования:
 * метод должен быть public static
 * сигнатура метода printArray(int[] numbers)
 * Элементы массива должны быть заключены в квадратные скобки []
 * Элементы массива отделены друг от друга запятой и пробелом.
 */
public class Task06 {
    public static void main(String[] args) {
        System.out.println(printArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }

    public static String printArray(int[] numbers) {
        return Arrays.toString(numbers);
    }
}
