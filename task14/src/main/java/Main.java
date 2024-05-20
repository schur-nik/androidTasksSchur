import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 2, 1, 7, 32, 122, 79, 3, 2, 99, 46, 12);

        System.out.println("Результат: " + StreamService.sumEvenOdd(numbers, 12));

        System.out.println("Результат: " + StreamService.countEvenOddInSublists(numbers, 12));


    }

}
