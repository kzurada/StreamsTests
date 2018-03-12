package Range;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainTest {
    private static String parzysta = "parzysta";
    private static String nieparzysta = "nieparzysta";


    public static void main(String[] args) {
        IntStream.range(1, 4)
                .mapToObj(i -> "element nr: " + i)
                .forEach(System.out::println);

        List<String> lista = Arrays.asList("a", "b", "c");
        lista
                .stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Stream.of("abc", "def", "ghi")
                .forEach(System.out::println);

    }

    public String ParzysteInieparzyste(int x) {
        return x % 2 == 0 ? "parzyste" : "nieparzyste";

    }
}
