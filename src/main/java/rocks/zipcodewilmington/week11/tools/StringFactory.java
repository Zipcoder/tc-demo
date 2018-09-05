package rocks.zipcodewilmington.week11.tools;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by leon on 5/29/17.
 */
public class StringFactory {

    private StringFactory() {
        /** this class is not to be instantiated */
    }

    /**
     * @param listSize - number of String objects to create
     * @return - ArrayList of String objects
     */
    public static List<String> createRandomStringList(int listSize) {
        return createRandomStringStream(listSize).collect(Collectors.toList());
    }

    /**
     * @param arrayLength - number of String objects to create
     * @return - Array of String objects
     */
    public static String[] createRandomStringArray(int arrayLength) {
        return createRandomStringStream(arrayLength).toArray(String[]::new);
    }

    /**
     * @param streamCount - number of String objects to create
     * @return - Stream representation of collection of String objects
     */
    public static Stream<String> createRandomStringStream(int streamCount) {
        return Stream.generate(StringFactory::createRandomString).limit(streamCount);
    }

    /**
     * @return randomly generated alpha-string up to 10 characters in length
     */
    public static String createRandomString() {
        return RandomUtils.createString('a', 'z', RandomUtils.createInteger(0,10));
    }
}
