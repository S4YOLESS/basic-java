package o5_strings.task05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Цель: Работа с регулярными выражениями
 * <p>
 * Что нужно знать:
 * <p>
 * 1. Классы String, Pattern, Matcher
 * 2. Регулярные выражения
 * <p>
 * Задание:
 * <p>
 * Реализовать метод, который будет принимать целочисленное строку, и отвечать соответствует ли эта строка почтовому ящику сервисов google (gmail.com) или майкрософт (outlook.com).
 * Будем считать, что в корректном почтовом ящике можно использовать только цифры и буквы.
 * <p>
 * Пример ввода: "java2023@gmail.com"
 * Пример вывода: true
 * <p>
 * Пример ввода: "@outlook.com"
 * Пример вывода: false
 * <p>
 * Требования:
 * метод должен быть public static
 * сигнатура метода isGmailOrOutlook(String email)
 * метод возвращает boolean
 */
public class Task05 {
    public static void main(String[] args) {
        System.out.println(isGmailOrOutlook("java2023@gmail.com"));
    }

    public static boolean isGmailOrOutlook(String email) {
        String txt1 = email.replaceAll("gmail.com", "");
        String txt2 = txt1.replaceAll("outlook.com", "");
        Pattern pat = Pattern.compile("^[A-Za-z0-9]+@+$");
        Matcher mat = pat.matcher(txt2);
        return mat.matches();
    }
}
