package o5_strings.task06;

/**
 * Вам дан список ролей и сценарий пьесы в виде массива строчек. Каждая строчка сценария пьесы дана в следующем виде:
 * <p>
 * Роль: текст
 * <p>
 * Текст может содержать любые символы.
 * <p>
 * Задание:
 * <p>
 * Напишите метод, который будет группировать строчки по ролям, пронумеровывать их и возвращать результат в виде готового текста (см. пример). Каждая группа распечатывается в следующем виде:
 * <p>
 * Роль:
 * i) текст
 * j) текст2
 * ...
 * ==перевод строки==
 * <p>
 * i и j -- номера строк в сценарии. Индексация строчек начинается с единицы, выводить группы следует в соответствии с порядком ролей.
 * Переводы строк между группами обязательны, переводы строк в конце текста не учитываются.
 * <p>
 * Заметим, что вам предстоит обработка огромной пьесы в 50 000 строк для 10 ролей – соответственно, неправильная сборка результирующей строчки может выйти за ограничение по времени.
 * <p>
 * Обратите внимание еще на несколько нюансов:
 * <p>
 * Имя персонажа может встречаться в строке более одного раза, в том числе с двоеточием;
 * название одной роли может быть префиксом названия другой роли (например, "Лука" и "Лука Лукич");
 * роль, у которой нет реплик, тоже должна присутствовать в выходном файле;
 * в качестве перевода строки надо использовать символ '\n' (перевод строки в стиле UNIX);
 * будьте внимательны, не добавляйте лишних пробелов в конце строк.
 * Пример ввода 1:
 * roles:
 * Городничий
 * Аммос Федорович
 * Артемий Филиппович
 * Лука Лукич
 * textLines:
 * Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
 * Аммос Федорович: Как ревизор?
 * Артемий Филиппович: Как ревизор?
 * Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.
 * Аммос Федорович: Вот те на!
 * Артемий Филиппович: Вот не было заботы, так подай!
 * Лука Лукич: Господи боже! еще и с секретным предписаньем!
 * Пример вывода 1:
 * Городничий:
 * 1) Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
 * 4) Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.
 * <p>
 * Аммос Федорович:
 * 2) Как ревизор?
 * 5) Вот те на!
 * <p>
 * Артемий Филиппович:
 * 3) Как ревизор?
 * 6) Вот не было заботы, так подай!
 * <p>
 * Лука Лукич:
 * 7) Господи боже! еще и с секретным предписаньем!
 * <p>
 * Требования:
 * 1. Метод должен быть публичным.
 * 2. Метод должен принимать на вход два массива строк.
 * 3. Метод должен возвращать строку.
 * 4. Результативная строка должна соответствовать условию.
 * 5. Необходимо использовать StringBuilder
 */
public class Task06 {
    public static void main(String[] args) {
        System.out.println(printTextPerRole(new String[]{"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"}, new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?", "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.", "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"}));
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        for (String role : roles) {
            result.append(role).append(":").append("\n");
            for (int i = 0; i < textLines.length; i++) {
                String text = textLines[i];
                if (text.startsWith(role)) {
                    text = text.replaceFirst(role + ":", (i + 1) + ")");
                    result.append(text).append("\n");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}
