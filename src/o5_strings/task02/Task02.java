package o5_strings.task02;

/**
 * Реализуйте метод:
 * public void parseAndPrintNumber(String str) {
 * <p>
 * }
 * <p>
 * Требования:
 * Метод не должен ничего возвращать.
 * Метод принимает в качестве параметра строку, например "1234".
 * Метод должен получать из строки число типа int, делить его на 2 и выводить его в консоль, используя System.out.println.
 * <p>
 * Примеры:
 * Пример ввода: "1200"
 * Пример вывода: 600
 */
public class Task02 {
    public static void main(String[] args) {
        Task02 tsk = new Task02();
        tsk.parseAndPrintNumber("1234");
    }

    public void parseAndPrintNumber(String str) {
        int a = Integer.parseInt(str);
        System.out.println(a / 2);
    }
}
