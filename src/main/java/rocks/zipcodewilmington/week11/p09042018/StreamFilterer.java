package rocks.zipcodewilmington.week11.p09042018;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 5/30/17.
 */ // TODO - Demo
public class StreamFilterer {
    private final String[] stringArray;

    public StreamFilterer(String[] stringArray) {
        this.stringArray = stringArray;
    }


    public Stream<String> getStringsShorterThan(int length) {
        return Arrays.stream(stringArray)
                .filter(word -> word.length() > length);
    }

    public Stream<String> getStringsLongerThan(int length) {
        return Arrays.stream(stringArray)
                .filter(word -> word.length() < length);
    }

    public Stream<String> getStringsWithExactLength(int length) {
        return Arrays.stream(stringArray)
                .filter(word -> word.length() == length);
    }
}
