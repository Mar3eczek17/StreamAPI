import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);

        Stream<Integer> stream = list.parallelStream()
                .filter(x -> x > 10)
                .map(x -> x * 2);

        List<Integer> result = stream.collect(Collectors.toList());
        System.out.println(result);

        int sum = IntStream.range(0,10)
                .parallel().map(x -> x * 10).sum();
        System.out.println(sum);
        }
    }
