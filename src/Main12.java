import java.util.stream.Stream;

public class Main12 {
    public static void main(String[] args) {
        Stream.iterate(2, x -> x < 25, x -> x + 6)
                .forEach(System.out::println);

        System.out.println("-------------");
        Stream.iterate(4, x -> x < 100, x -> x*4).forEach(System.out::println);
    }
}
