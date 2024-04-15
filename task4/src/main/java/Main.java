import java.util.*;

public class Main {
    public static void main(String[] args) {
        //task0
        System.out.println("\nTASK 0");
        int[] arrTask0 = {42, 53, 51, 22, 15, 66};
        System.out.println("Введите число, которое необходимо проверить на входимость в массив " + Arrays.toString(arrTask0) + ":");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (task0(input, arrTask0)) {
            System.out.println("Число " + input + " входит в данный массив.");
        } else {
            System.out.println("Число " + input + " не входит в данный массив.");
        }

        //task1
        System.out.println("\nTASK 1");
        int[] arrTask1 = {42, 53, 12, 22, 15, 66};
        System.out.println("Введите число, которое необходимо удалить из массива {42, 53, 12, 22, 15, 66}:");
        input = scanner.nextInt();

        int[] resArrTask1 = task1(input, arrTask1);
        if (resArrTask1 != arrTask1) {
            System.out.println("Число " + input + " удалено из массива.");
            System.out.println("Новый массив: " + Arrays.toString(resArrTask1));
        } else {
            System.out.println("Число " + input + " не входит в данный массив.");
        }

        //task2
        System.out.println("\nTASK 2");
        Random randTask2 = new Random();
        int[] arrTask2 = {randTask2.nextInt(100), randTask2.nextInt(100), randTask2.nextInt(100), randTask2.nextInt(100), randTask2.nextInt(100), randTask2.nextInt(100)};

        int[] resArrTask2 = task2(arrTask2);
        System.out.println("Массив: " + Arrays.toString(arrTask2));
        System.out.println("Максимальное значение в массиве: " + resArrTask2[0]);
        System.out.println("Минимальное значение в массиве: " + resArrTask2[1]);
        System.out.println("Среднее значение в массиве: " + resArrTask2[2]);

        //task3
        System.out.println("\nTASK 3");
        Random randTask3 = new Random();
        int[] arrTask3 = {randTask3.nextInt(100), randTask3.nextInt(100), randTask3.nextInt(100), randTask3.nextInt(100), randTask3.nextInt(100), randTask3.nextInt(100)};

        int[] resArrTask3 = task3(arrTask3);
        System.out.println("Исходный массив: " + Arrays.toString(arrTask3));
        System.out.println("Новый массив: " + Arrays.toString(resArrTask3));
    }

    // 0. Создайте массив целых чисел. Напишете программу, которая выводит сообщение о том, входит ли заданное число в массив или нет.
    // Пусть число для поиска задается с консоли (класс Scanner).
    // Не использовать методы класса Arrays.
    public static Boolean task0(int input, int[] arr) {
        boolean flagIn = false;

        for (int el : arr) {
            if (input == el) {
                flagIn = true;
                break;
            }
        }

        return flagIn;
    }

    // 1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
    // Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
    // В результате должен быть новый массив без указанного числа.
    public static int[] task1(int input, int[] arr) {
        int countEl = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != input) {
                arr[countEl] = arr[i];
                countEl++;
            }
        }

        if (countEl != arr.length) {
            return Arrays.copyOf(arr, countEl);
        } else {
            return arr;
        }
    }

    //2. Создайте и заполните массив случайным числами и выведете
    //максимальное, минимальное и среднее значение
    public static int[] task2(int[] arr) {
        int min = arr[0], max = arr[0], average = 0;

        for (int el : arr) {
            if (el > max) {
                max = el;
            }
            if (el < min) {
                min = el;
            }
            average = average + el;
        }

        return new int[] {max, min, average / arr.length};
    }

    //3. Создайте массив из произвольных чисел. Создайте новый массив, который будет хранить
    //эти же элементы, но в обратном порядке.
    public static int[] task3(int[] arr) {
        int[] resArr = new int[arr.length];

        for (int i = arr.length-1; i >= 0; i--) {
            resArr[arr.length-1 - i] = arr[i];
        }

        return resArr;
    }

}
