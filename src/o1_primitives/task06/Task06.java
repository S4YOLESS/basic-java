package o1_primitives.task06;

import java.math.BigInteger;

/**
 * Цель: Использовать арифметические операции с BigInteger
 *
 * Что нужно знать:
 * 1. класс BigInteger
 * 2. класс Long
 *
 * Задание:
 * Реализовать метод, выводящий на экран квадрат максимального значения, которое может содержаться в переменной long.
 * Чтобы это значение уместилось, необходимо использовать класс BigInteger
 *
 * Требования:
 * метод должен быть public static
 * сигнатура метода maxLongSqr()
 */
public class Task06 {
    public static void main(String[] args) {
        System.out.println(maxLongSqr());
    }

    public static BigInteger maxLongSqr() {
        long a = Long.MAX_VALUE;
        BigInteger x = BigInteger.valueOf(a);
        BigInteger y = x.multiply(x);
        return y;
    }
}