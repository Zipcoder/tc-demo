package rocks.zipcodewilmington.week11.p09042018;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by leon on 5/29/17.
 */ // TODO - Demo
public class StreamCreator {

    /** @param stringArray source array to create stream
     *  @return stream representation of this array */
    public Stream<String> fromArray1(String[] stringArray) {
        Stream<String> stringStream = Arrays.stream(stringArray);
        return stringStream;
    }

    /** @param stringArray source array to create stream
     *  @return stream representation of this array */
    public Stream<String> fromArray2(String[] stringArray) {
        Stream<String> stringStream = Stream.of(stringArray);
        return stringStream;
    }

    /** @return stream representation of this array */
    public Stream<String> fromVarargs() {
        Stream<String> stringStream = Stream.of("The", "Quick", "Brown", "Fox", "Jumps");
        return stringStream;
    }

     /** @param stringList source list to create stream
     *   @return stream representation of this List */
    public Stream<String> fromList(List<String> stringList) {
        Stream<String> stringStream = stringList.stream();
        return stringStream;
    }

    /** @return endless stream */
    public Stream<String> fromGenerator1() {
        Stream<String> stringStream = Stream.generate(() -> "Hello World");
        return stringStream;
    }

    /** @return endless stream */
    public Stream<Double> fromGenerator2() {
        Stream<Double> stringStream = Stream.generate(Math::random);
        return stringStream;
    }

    /** @return empty Stream of Strings */
    public Stream<String> fromEmpty() {
        return Stream.empty();
    }

    /** @return ? */
    public Stream<String> fromIterator() {
//        return Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));
        return null;
    }

}
