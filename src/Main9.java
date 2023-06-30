import java.util.stream.Stream;

public class Main9 {
    public static void main(String[] args) {
        Stream.iterate(2, x -> x + 6).limit(6).forEach(System.out::println);
        }
    }
