import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main4 {
    public static void main(String[] args) {
        final List<Integer> ints = new ArrayList<>();
        IntStream.range(0, 1000000)
                .parallel()
                .forEach(i -> ints.add(i));
        System.out.println(ints.size());
        }
    }
