package o4_arrays.task04;

/**
 * Цель: Развернуть данный массив
 * <p>
 * Что нужно знать:
 * 1. Работа с массивами
 * 2. Циклы
 * <p>
 * Задание: Написать метод, который принимает массив, разворачивает его и возвращает.
 * <p>
 * Пример ввода: {1, 4, 6, 7}
 * Пример вывода: [7, 6, 4, 1]
 * <p>
 * Пример ввода: {}
 * Пример вывода: []
 * <p>
 * Требования:
 * метод должен быть public static
 * сигнатура метода inverseArray(int[] numbers)
 */
public class Task04 {
    public static void main(String[] args) {

        System.out.println(inverseArray(new int[]{1, 4, 6, 7}));
    }

    public static String inverseArray(int[] numbers) {
        String result = "";

        for (int i = numbers.length - 1; i >= 1; i--) {
            result = result + numbers[i] + ", ";
        }
        int first = numbers[numbers.length - 4];

        return "[" + result + first + "]";
    }
}
