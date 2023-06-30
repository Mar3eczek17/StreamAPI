import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
        stream.filter(s -> s.contains("Stream API"));
        stream.forEach(System.out::println);
        }
    }
