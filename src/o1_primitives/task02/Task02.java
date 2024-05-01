package o1_primitives.task02;

/**
 * Цель: научиться применять арифметические вычисления
 *
 * IT Компания собрала новую команду программистов и закупает оборудование для их рабочих мест.
 *
 * Как известно, все программисты очень любят иметь как можно больше мониторов. Всем работникам надо выдать одинаковое количество мониторов (иначе они поссорятся).
 *
 * Напишите программу, которая принимает на вход количество мониторов купленных компанией и количество программистов в ней, а возвращает количество мониторов, которые никому не достанутся.
 *
 * Требования:
 * 1) Сигнатура метода содержит только примитивные типы размерностью в 32 бита
 * 2) Название метода должно быть drawisMonitorsCounter
 * 3) Метод должен быть виден из любого пакета
 * 4) Сигнатура метода должна быть: drawisMonitorsCounter(int monitors, int programmers)
 */
public class Task02 {
    public static void main(String[] args) {
        int monitors = 256; //FIXME
        int programmes = 31; //FIXME
        int remainingMonitors = drawisMonitorsCounter(monitors, programmes);
        System.out.println("Количество нераспределенных мониторов: " + remainingMonitors);
    }
    public static int drawisMonitorsCounter(int monitors, int programmers) {
        int drawisMonitorsCounter = monitors%programmers;
        return drawisMonitorsCounter;
    }
}
