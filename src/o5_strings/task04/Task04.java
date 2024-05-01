package o5_strings.task04;

/**
 * Цель: Преобразование строки в число
 * <p>
 * Что нужно знать:
 * 1. Класс String
 * 2. Класс Long
 * 3. Класс Math
 * <p>
 * Задание:
 * Реализовать метод, который будет принимать целочисленное (long) число в строковом виде (например "14213123"), преобразовывать его в тип long,
 * вычислять из него квадратный корень, и округлять получившееся значение до ближайшего long. Ддя округления воспользуйтесь классом Math.
 * <p>
 * <p>
 * Пример ввода: "64"
 * Пример вывода: 8
 * <p>
 * Пример ввода: "5"
 * Пример вывода: 2
 * <p>
 * Требования:
 * метод должен быть public static
 * сигнатура метода parseAndSqrt(String number)
 * метод возвращает long
 */
public class Task04 {
    public static void main(String[] args) {
        System.out.println(parseAndSqrt("14213123"));
    }

    public static long parseAndSqrt(String number) {
        long res = Long.parseLong(number);
        double r = Math.sqrt(res);
        res = Math.round(r);
        return res;
    }
}
