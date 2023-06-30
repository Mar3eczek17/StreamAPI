import java.util.stream.Stream;

public class Main8 {
    public static void main(String[] args) {
        Stream.generate(() -> 6).limit(6)
                .forEach(System.out::println);
        }
    }
