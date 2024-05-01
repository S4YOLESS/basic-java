package o4_arrays.task02;

/**
 * Дан массив возрастающих чисел. Даны два числа. Задача - написать метод, который из данного массива достанет ту часть, которая лежит между данными числами (включительно) и вернет ее в качестве массива.
 *
 * Что нужно знать:
 * 1. Работа с массивами
 * 2. Циклы
 * 3. Условные операторы
 *
 * Пример ввода: {1,3,5,6,9,11,24}, 4, 10
 * Пример вывода: [5, 6, 9]
 *
 * Требования:
 * метод должен быть public static
 * сигнатура метода getSubArrayBetween(int[] numbers, int start, int end)
 * метод должен возвращать int[] (подмассив)
 * реализовать задачу без ипользования класса Arrays
 */
public class Task02 {
    public static void main(String[] args) {
        System.out.println(getSubArrayBetween(new int[] {1,3,5,6,9,11,24}, 4, 10));
    }

    public static String getSubArrayBetween(int[] numbers, int start, int end) {
        String res = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > start && numbers[i]< end) {
                res = res + numbers[i]+ ", ";
            }
        }
        res = res.substring(0,res.length()-2);

    return "["+res+"]";
    }
}
