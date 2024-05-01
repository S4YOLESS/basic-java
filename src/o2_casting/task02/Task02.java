package o2_casting.task02;

/**
 * Цель: Узнать про неявные приведения
 *
 * Что нужно знать:
 *
 * 1. Арифметические операции
 * 2. Примитивные типы
 * 3. неявные приведения
 *
 * Задание:
 * Реализовать метод, который будет принимать два числа, выражающие возраст людей, и возвращать разницу в возрасте.
 *
 *
 * Пример ввода: 2, 5
 * Пример вывода: 3
 *
 * Пример ввода: 4, 1
 * Пример вывода: 3
 *
 * Требования:
 * метод должен быть public static
 * сигнатура метода getAgeDiff(byte age1, byte age2)
 * метод возвращает int
 */
public class Task02 {
    public static void main(String[] args) {
        int a = 30;
        int b = 18;
        byte x = (byte) a;
        byte y = (byte) b;
        System.out.println(getAgeDiff(x,y));
    }
    public static int getAgeDiff(byte age1, byte age2){
        int raz = age1 - age2;
        return raz;
    }
}
