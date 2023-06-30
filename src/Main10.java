import java.util.stream.Stream;

public class Main10 {
    public static void main(String[] args) {
        Stream
                .iterate(1, x -> x * 2)
                .limit(6).forEach(System.out::println);
        }
    }
