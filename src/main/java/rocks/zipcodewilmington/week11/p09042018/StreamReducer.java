package rocks.zipcodewilmington.week11.p09042018;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by leon on 5/30/17.
 */// TODO - Demo
public class StreamReducer {
    private final Stream<String> stringStream;

    /**
     * @param strings Array to convert to Stream
     */
    public StreamReducer(String... strings) {
        this.stringStream = Arrays.stream(strings);
    }

    /**
     * @return number of elements in stream
     */
    public int getCount() {
        return (int) stringStream.count();
    }

    /**
     * @param subString Sub-string to check against
     * @return true if at least one string contains the specified substring
     */
    public boolean containsSubstring(String subString) {
        return stringStream.anyMatch(s -> s.contains(subString));
    }

    /**
     * @return longest String object in stream
     */
    public Optional<String> getMax() {
        return stringStream.max(String::compareToIgnoreCase);
    }

    /**
     * @return arbitrary small String
     */
    public Optional<String> getRandom() {
        return stringStream.findAny();
    }
}
