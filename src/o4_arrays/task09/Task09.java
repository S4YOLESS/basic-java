package o4_arrays.task09;

/**
 * Напишите метод printOddNumbers, который принимает массив и выводит в консоль только нечетные числа из него, через запятую. Конец вывода должен перевести курсор на новую строку.
 * <p>
 * Пример ввода: [3,5,20,8,7,3,100]
 * Пример вывода: 3,5,7,3
 * <p>
 * Требования:
 * Сигнатура метода должна быть: printOddNumbers(int[] arr)
 */
public class Task09 {
    public static void main(String[] args) {
        System.out.print(printOddNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

    public static String printOddNumbers(int[] arr) {
        String res = "";
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 != 0) {
                res = res + arr[i] + ",";
            }
        }
        int last = arr[arr.length - 1];
        return res + last;
    }
}
