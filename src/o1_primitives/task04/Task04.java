package o1_primitives.task04;

/**
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c ?
 * Допустимая погрешность – 0.0001 (1E-4)
 * Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
 *
 * Требования:
 * Метод должен иметь сигнатуру: doubleExpression(double a, double b, double c)
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 */
public class Task04 {
    public static void main(String[] args) {
        boolean x = doubleExpression(5,6,7);
        System.out.println(x);
    }
    public static boolean doubleExpression(double a, double b, double c) {
        boolean res = Math.abs((a+b)-c) > - 0.0001;
        return res;
    }
}
