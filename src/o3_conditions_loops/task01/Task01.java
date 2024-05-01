package o3_conditions_loops.task01;


import java.math.BigInteger;

/**
 * Урок с кодом.
 * Реализуйте метод factorial, вычисляющий факториал заданного натурального числа.
 *
 * Факториал N вычисляется как 1 ⋅ 2 ⋅ ... ⋅ N.
 *
 * Поскольку это очень быстро растущая функция, то даже для небольших N вместимости типов int и long очень скоро не хватит.
 * Поэтому будем использовать BigInteger.
 *
 * Пример ввода 1: 1
 * Пример возвращаемого значения 1: 1
 *
 * Пример ввода 2: 3
 * Пример возвращаемого значения 2: 6
 *
 * Требования:
 * 1. Метод должен быть public.
 * 2. Метод должен быть static.
 * 3. Передаваемый параметр должен иметь тип int.
 * 4. Метод должен быть реализован через цикл.
 */
public class Task01 {
    public static void main(String[] args) {
        System.out.println(factorial(7));
    }

    public static BigInteger factorial (int f){
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= f; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}