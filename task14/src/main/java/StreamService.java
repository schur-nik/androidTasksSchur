import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamService {
    public static Map<Boolean, Integer> sumEvenOdd(List<Integer> numbers, int n) {
        return numbers.stream()
                .limit(n)
                .collect(Collectors.partitioningBy(num -> num % 2 == 0, Collectors.summingInt(num -> num)));
    }

    public static Map<Boolean, Long> countEvenOddInSublists(List<Integer> numbers, int n) {
        return numbers.stream()
                .limit(n)
                .collect(Collectors.partitioningBy(num -> num % 2 == 0, Collectors.counting()));
//                Пытался сделать не bool а Type, но застрял
//                .entrySet()
//                .stream()
//                .map(entry -> entry.getKey() ? Map.entry(Type.EVEN, entry.getValue()) : Map.entry(Type.ODD, entry.getValue()))
    }

//    enum Type {
//        EVEN,
//        ODD
//    }

}
