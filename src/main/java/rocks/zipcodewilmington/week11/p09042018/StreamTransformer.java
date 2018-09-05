package rocks.zipcodewilmington.week11.p09042018;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by leon on 5/30/17.
 */// TODO - Demo
public class StreamTransformer {
    public Stream<String> combineStreams(String[] array1, String[] array2) {
        Stream<String> stream1 = Arrays.stream(array1);
        Stream<String> stream2 = Arrays.stream(array2);

        return Stream.concat(stream1, stream2);
    }

    public Stream<String> uniqueWords(String... words) {
        return Stream.of(words).distinct();
    }

    public Stream<String> longestFirst(String... words) {
        return Stream.of(words).sorted(Comparator.comparing(String::length).reversed());
    }

    public Stream<String> longestLast(String... words) {
        return Stream.of(words).sorted(Comparator.comparing(String::length));
    }

    public Stream<String> sort(String[] words) {
        return Arrays.stream(words).sorted();
    }
}
