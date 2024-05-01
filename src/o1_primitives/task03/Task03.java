package o1_primitives.task03;
import java.util.Scanner;
/**
 * Опишите публичный метод priceCalculation, который считает стоимость товара.
 * В метод передается цена товара (может быть дробной) и количество товара, метод должен возвращать итоговую цену покупки.
 *
 * Пример ввода: 8.50, 2
 * Пример вывода: 17.0
 *
 * Требования:
 * Сигнатура метода должна быть: priceCalculation(double price, int count)
 */


public class Task03 {
    public static void main(String[] args) {
        double priceCalculation = priceCalculation(15.0,5);
        System.out.println(priceCalculation);
    }
    public static double priceCalculation (double price, int count) {
        return price*count;
    }
}
