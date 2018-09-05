package rocks.zipcodewilmington.week11;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 9/4/18.
 */
public class StreamDemo {
    public static void main(String[] args) {
        new StreamDemo().demo();
    }

    public void demo() {
        Optional<String> o = Optional.of("Hello");
        String value = o.get();
        o.ifPresent(System.out::print);
    }

    // This method definition showcases Stream.forEach syntax
    public void streamPrint(String[] array1, String[] arr) {
        Stream<String> s = Arrays.stream(array1);
        Stream<String> x = Arrays.stream(arr);

        Stream<String> result = Stream.concat(s, x);
    }

    public void forloopPrint(String... stringArray) {
        for (String currentString : stringArray) {
            System.out.println(currentString);
        }
    }
}
