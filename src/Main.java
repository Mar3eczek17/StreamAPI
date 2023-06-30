import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.stream(args)
                .filter(s -> s.length() <= 2)
                .collect(Collectors.toList());

        Stream.of(120, 410,85,32,314,12)
                .filter(x -> x < 300)
                .map(x -> x +11)
                .limit(3)
                .forEach(System.out::println);
    }
}
