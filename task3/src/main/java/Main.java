import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input;
        boolean isRun = true;
        while (isRun) {
            printMenu();

            try {
                input = Integer.parseInt(reader.readLine());

                switch (input) {
                    case 1 :
                        System.out.println("Для определения поры года введите месяц от 1 до 12: ");
                        input = Integer.parseInt(reader.readLine());
                        if (input > 0 && input <= 12) {
                            System.out.println("Сейчас: " + taskControlStructures1(input));
                        } else {
                            System.out.println("Месяц должен быть от 1 до 12");
                        }
                        break;
                    case 2 :
                        System.out.println("Для определения поры года введите месяц от 1 до 12: ");
                        input = Integer.parseInt(reader.readLine());
                        if (input > 0 && input <= 12) {
                            System.out.println("Сейчас: " + taskControlStructures2(input));
                        } else {
                            System.out.println("Месяц должен быть от 1 до 12");
                        }
                        break;
                    case 3 :
                        System.out.println("Введите число для определения четности: ");
                        input = Integer.parseInt(reader.readLine());
                        System.out.println("Число " + input + taskControlStructures3(input));
                        break;
                    case 4 :
                        System.out.println("Введите t (температуру), для определения погоды на улице: ");
                        input = Integer.parseInt(reader.readLine());
                        System.out.println("Температура на улице " + input +  " это - " + taskControlStructures4(input));
                        break;
                    case 5 :
                        System.out.println("Нечетные числа от 1 до 99: ");
                        System.out.println(taskCycles1());
                        break;
                    case 6 :
                        System.out.println("Числа от 5 до 1: ");
                        System.out.println(taskCycles2());
                        break;
                    case 7 :
                        try {
                            System.out.println("Введите целое положительное число не больше 2 147 483 647: ");
                            Scanner scanner = new Scanner(System.in);
                            input = scanner.nextInt();
                            if (input > 0) {
                                System.out.println("Сумма от 1 до " + input + " = " + taskCycles3(input));
                            } else {
                                System.out.println("Число должно быть положительным");
                            }
                        } catch (InputMismatchException ex) {
                            System.out.println("Число должно быть положительным, целым и не больше 2 147 483 647");
                            break;
                        }
                        break;
                    case 8 :
                        System.out.println("Последовательность от 7 до 98: ");
                        System.out.println(taskCycles4());
                        break;
                    case 9 :
                        isRun = false;
                        break;
                    default:
                        System.out.println("Ошибка выбора задачи. Сделайте выбор и введите номер задачи!");
                }
            } catch (IOException ex) {
                System.out.println("Ошибка считывания строки, повторите ввод");
            } catch (NumberFormatException ex) {
                System.out.println("Ошибка преобразования строки в число, повторите ввод");
            }
        }

    }

    public static void printMenu() {
        System.out.println("Введите номер задачи в консоль:");
        System.out.println("Управляющие конструкции");
        System.out.println("1 - Вывод названия поры года по номеру месяца (switch-case)");
        System.out.println("2 - Вывод названия поры года по номеру месяца (if-else-if)");
        System.out.println("3 - Определение четности числа (используя операцию '% 2')");
        System.out.println("4 - Вывод сообщения в зависимости от температуры на улице");

        System.out.println("Циклы");
        System.out.println("5 - Вывод нечетных чисел от 1 до 99 при помощи цикла for и операции инкремента");
        System.out.println("6 - Вывод чисел от 5 до 1 при помощи цикла и операции декремента");
        System.out.println("7 - Суммирование чисел от 1 до введенного пользователем числа");
        System.out.println("8 - Вывод последовательности: 7 14 21 28 35 42 49 56 63 70 77 84 91 98 с использованием цикла while");

        System.out.println(" ");
        System.out.println("9 - Выход");
    }

    //1. Написать программу для вывода названия поры года по номеру
    //месяца.
    public static String taskControlStructures1(int n_month) {
        return switch (n_month) {
            case 1, 2, 12 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Неизвестная пора года";
        };
    }

    public static String taskControlStructures2(int n_month) {
        if (n_month == 1 || n_month == 2 || n_month == 12) {
            return "Зима";
        }
        else if (n_month == 3 || n_month == 4 || n_month == 5) {
            return "Весна";
        }
        else if (n_month == 6 || n_month == 7 || n_month == 8) {
            return "Лето";
        }
        else if (n_month == 9 || n_month == 10 || n_month == 11) {
            return "Зима";
        }
        return "Неизвестная пора года";
    }

    public static String taskControlStructures3(int number) {
        if (number % 2 == 0) {
            return " четное";
        }
        else {
            return " нечетное";
        }
    }

    public static String taskControlStructures4(int t) {
        if (t > -5 && t < 5000) {
            return "Тепло";
        }
        else if (t <= -20) {
            return "Холодно";
        }
        else if (t >= 5000) {
            return "Вы на солнце, все хорошо?";
        }
        else {
            return "Нормально";
        }
    }

    public static ArrayList<Integer> taskCycles1() {
        ArrayList<Integer> listNumbers = new ArrayList<>();
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                listNumbers.add(i);
            }
        }
        return listNumbers;
    }

    public static ArrayList<Integer> taskCycles2() {
        ArrayList<Integer> listNumbers = new ArrayList<>();
        for (int i = 5; i >= 1; i--) {
            listNumbers.add(i);
        }
        return listNumbers;
    }

    public static Long taskCycles3(int number) {
        long result = 0L;
        for (int i = 1; i <= number; i++) {
            result = result + i;
        }
        return result;
    }

    public static ArrayList<Integer> taskCycles4() {
        ArrayList<Integer> listNumbers = new ArrayList<>();
        int number = 0;
        while (number < 98) {
            number = number + 7;
            listNumbers.add(number);
        }
        return listNumbers;
    }
}

