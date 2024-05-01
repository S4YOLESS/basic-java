package o3_conditions_loops.task05;

/**
 * Цель: Работа с оператором if/else
 *
 * Что нужно знать:
 * 1. Оператор if
 *
 * Задание:
 * Решить предыдущую задачу при помощи оператора if
 *
 * Требования:
 * метод должен быть public static
 * сигнатура метода isWeekend(String weekDay)
 * метод возвращает boolean
 * решить с использованием оператора if
 */

public class task05 {
    public static void main(String[] args) {
        System.out.println(isWeekend("Saturday"));
    }
    public static boolean isWeekend(String weekDay) {
        if (weekDay == "Saturday") {
            return true;
        }
        else if (weekDay == "Sunday") {
            return true;
        }
        else {
            return false;
        }
    }
}