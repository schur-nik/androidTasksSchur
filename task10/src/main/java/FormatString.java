import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatString {
    public static final String INVALID_INPUT = "Строка не соответствует формату xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.";

    //Вывести на экран в одну строку два первых блока по 4 цифры.
    public static String firstEightNumber(String input) {
        if (isValidFormat(input)) {
            String[] splitInput = input.split("-");
            return splitInput[0]+splitInput[2];
        } else {
            return INVALID_INPUT;
        }
    }

    //Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
    public static String replaceLetters(String input) {
        if (isValidFormat(input)) {
            return input.replaceAll("[a-zA-Z]{3}", "***");
        } else {
            return INVALID_INPUT;
        }
    }

    //Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
    public static String onlyLettersInLower(String input) {
        if (isValidFormat(input)) {
            String result = "";
            Pattern pattern = Pattern.compile("[a-zA-Z]+");
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                result = result + matcher.group().toLowerCase() + "/";
            }
            return result.substring(0, result.length()-1);
        } else {
            return INVALID_INPUT;
        }
    }

    //Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
    public static String onlyLettersInUpper(String input) {
        if (isValidFormat(input)) {
            StringBuilder result = new StringBuilder();
            Pattern pattern = Pattern.compile("[a-zA-Z]+");
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                result.append(matcher.group().toUpperCase()).append("/");
            }
            result.deleteCharAt(result.length()-1);
            return result.toString();
        } else {
            return INVALID_INPUT;
        }
    }

    //Проверить содержит ли номер документа последовательность abc и вывести сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
    public static String isHaveABC(String input) {
        if (isValidFormat(input)) {
            return input.toLowerCase().contains("abc") ? "Введенная строка содержит подстроку ABC" : "Введенная строка не содержит подстроку ABC";
        } else {
            return INVALID_INPUT;
        }
    }

    //Проверить начинается ли номер документа с последовательности 555.
    public static String isStart555(String input) {
        if (isValidFormat(input)) {
            return input.startsWith("555") ? "Введенная строка начинается с последовательности 555" : "Введенная строка не начинается с последовательности 555";
        } else {
            return INVALID_INPUT;
        }
    }

    //Проверить заканчивается ли номер документа на последовательность 1a2b.
    public static String isEnd1a2b(String input) {
        if (isValidFormat(input)) {
            return input.endsWith("1a2b") ? "Введенная строка заканчивается с последовательностью 1a2b" : "Введенная строка не заканчивается с последовательностью 1a2b";
        } else {
            return INVALID_INPUT;
        }
    }

    public static boolean isValidFormat(String input) {
//        Pattern pattern = Pattern.compile("\\d{4}-[a-zA-Z]{3}-\\d{4}-[a-zA-Z]{3}-\\d[a-zA-Z]\\d[a-zA-Z]");
//        Matcher matcher = pattern.matcher(input);
//        return matcher.matches();
        return input.matches("\\d{4}-[a-zA-Z]{3}-\\d{4}-[a-zA-Z]{3}-\\d[a-zA-Z]\\d[a-zA-Z]");
    }
}
