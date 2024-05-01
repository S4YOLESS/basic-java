package o1_primitives.task05;

/**
 * Цель: Вычисление радиуса окружности по площади с использованием класса Math.
 *
 * Что нужно знать:
 * 1. Класс Math (методы и константы)
 * 2. Базовая арифметика
 * 3. System.out.printf
 *
 * Задание:
 * Реализовать метод calcCircleRaduis(double area), который вычисляет радиус окружности по заданной площади и выводит его на экран.
 * Точность - 3 знака после запятой. Для указания количества знаков после запятой используйте метод для форматированного вывода System.out.printf
 *
 * Пример ввода: 123
 * Пример вывода: 6.257
 *
 * Пример ввода: 10
 * Пример вывода: 1.784
 *
 * Требования:
 *
 * метод должен быть public static
 * сигнатура метода calcCircleRaduis(double area)
 * выводить на экран число с тремя знаками после запятой
 */
public class task05 {
    public static void main(String[] args) {
        double result = calcCircleRadius(123);
        System.out.printf("%1.3f",result);
    }
    public static double calcCircleRadius (double area){
        double radius = Math.abs(area / Math.PI);
        double res = Math.sqrt(radius);
        return res;
    }
}

