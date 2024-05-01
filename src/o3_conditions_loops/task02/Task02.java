package o3_conditions_loops.task02;

/**
 * Реализуйте предыдущую задачу с использованием рекурсии.
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
 * 4. Реализация метода должна быть через рекурсию.
 */
public class Task02 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int f) {
        if (f<1) {
            return 1;
        }
        else {
            return f*factorial(f-1);
        }
    }
}
