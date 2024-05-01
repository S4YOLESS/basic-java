package o3_conditions_loops.task06;

/**
 * Цель: Работа с тернарным оператором
 *
 * Что нужно знать:
 *
 * 1. Тернарный оператор
 *
 * Задание:
 * Решить предыдущую задачу при помощи тернарного оператора и если переданная строка является выходным днем, то возвращать строку:
 * "Ура, выходной!". В других случаях возвращать строку "Надо еще поработать".
 *
 *
 * Пример ввода: "Monday"
 * Пример вывода: "Надо еще поработать"
 *
 * Пример ввода: "Sunday"
 * Пример вывода: "Ура, выходной!"
 *
 * Требования:
 * метод должен быть public static
 * сигнатура метода checkWeekend(String weekday)
 * метод возвращает String
 * решить с использованием тернарного оператора
 */
public class Task06 {
    public static void main(String[] args) {
        System.out.println(checkWeekend("Monday"));
    }

    public static String checkWeekend (String weekday) {
        String check = (weekday == "Saturday" || weekday =="Sunday") ? "Ура, выходной!" : "Надо еще поработать";
        return check;
    }
}
