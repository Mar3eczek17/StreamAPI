import java.util.Arrays;
import java.util.stream.Stream;

public class Main6 {
    public static void main(String[] args) {
        Arrays.asList(1,2,3).stream().forEach(System.out::println);
        System.out.println("------------------------");
        Stream.of(1,2,3).forEach(System.out::println);
        }
    }
