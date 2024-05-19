import java.util.Arrays;
import java.util.stream.IntStream;

public class MainTask2 {
    public static void main(String[] args) {
        IntStream stream = IntStream.iterate(1, v -> v + 1);
        //1) Найти среднее значение первых 10 чисел.
        System.out.println(stream.limit(10).average());

        stream = IntStream.iterate(1, v -> v + 1);
        //2) Пропустить 5 чисел и вывести следующие 10 чисел, которые делятся на 3 без остатка
        System.out.println(Arrays.toString(stream.skip(5).filter(i -> i % 3 == 0).limit(10).toArray()));

        stream = IntStream.iterate(1, v -> v + 1);
        //3) Посчитать сумму 20 подряд идущих чисел
        System.out.println(stream.limit(20).sum());
    }
}
