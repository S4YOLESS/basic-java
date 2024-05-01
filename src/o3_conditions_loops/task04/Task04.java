package o3_conditions_loops.task04;

/**
 * Цель: Работа с оператором switch
 *
 * Что нужно знать:
 * 1. Оператор switch
 *
 * Задание:
 * Реализовать метод, который будет принимать строку с названием дня недели, и отвечать, является ли этот день выходным. Список дней недели:
 * "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday". Если строка не соответствует ни одному дню недели отправлять false.
 *
 *
 * Пример ввода: Monday
 * Пример вывода: false
 *
 * Пример ввода: Saturday
 * Пример вывода: true
 *
 * Требования:
 *
 * метод должен быть public static
 * сигнатура метода isWeekend(String weekDay)
 * метод возвращает boolean
 * решить с использованием оператора switch
 */
public class Task04 {
    public static void main(String[] args) {
        System.out.println(isWeekend("Saturday"));
    }
    public static boolean isWeekend(String weekDay) {
        return "Saturday".equalsIgnoreCase(weekDay) || "Sunday".equalsIgnoreCase(weekDay);
    }
}
//public static void main(String[] args) {
//System.out.println(isWeekend("Sunday"));
//}
//public static boolean isWeekend(String weekDay) {
//switch (weekDay) {
//case "Monday":
//return false;
//case "Tuesday":
//return false;
//case "Wednesday":
//return false;
//case "Thursday":
//return false;
//case "Friday":
//return false;
//}
//return true;
//}
//}
