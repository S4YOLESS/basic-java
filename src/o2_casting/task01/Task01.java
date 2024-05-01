package o2_casting.task01;

/**
 * Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 *
 * Требования:
 * 1. Сигнатура метода должна быть: charExpression(int a)
 */
public class Task01 {
    public static void main(String[] args) {
        char a = charExpression (6);
        System.out.println(a);
    }

    public static char charExpression(int a) {
        char b = '\\';
        char res = (char) (b+a);
        return res;
    }
}