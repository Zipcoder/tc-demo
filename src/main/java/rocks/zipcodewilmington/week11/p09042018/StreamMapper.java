package rocks.zipcodewilmington.week11.p09042018;

import java.util.stream.Stream;

/**
 * Created by leon on 5/29/17.
 */// TODO - Demo
public class StreamMapper {
    /**
     * @param someWord word to convert to Stream<String>
     * @return a Stream of single characters
     */
    public Stream<String> letters(String someWord) {
        String[] characters = someWord.split("");
        return Stream.of(characters);
    }

    /**
     * @param someWords variable amount of String arguments
     * @return a Stream of several Streams of single characters
     */
    public Stream<Stream<String>> wordsMap(String... someWords) {
        return Stream.of(someWords).map(w -> letters(w));
    }

    /**
     * @param stringArray variable amount of String arguments
     * @return a Stream of several Streams of single characters
     */
    public Stream<String> wordsFlatMap(String... stringArray) {
        return Stream.of(stringArray).flatMap(w -> letters(w));
    }
}
