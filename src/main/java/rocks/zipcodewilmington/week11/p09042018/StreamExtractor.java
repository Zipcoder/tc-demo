package rocks.zipcodewilmington.week11.p09042018;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 5/30/17.
 */ // TODO - Demo
public class StreamExtractor {
    public Stream<String> getSubStream(String[] stringArray, int startIndex, int endIndex) {
        return Arrays.stream(stringArray, startIndex, endIndex);
    }

    public Stream<String> getSubStream(String[] stringArray, int endIndex) {
        return Arrays.stream(stringArray).limit(endIndex);
    }
}
