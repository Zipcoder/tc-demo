package rocks.zipcodewilmington.week11.p09052018;

import com.zipcodewilmington.streams.tools.LocaleFactory;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by leon on 6/7/17.
 */
public class CollectorsDemo {
    private final List<String> stringList;

    public CollectorsDemo(List<String> list) {
        this.stringList = list;
    }

    private Stream<String> toStream() {
        return stringList.stream();
    }

    // TODO - Demo For Each
    public void demoForEach(Consumer<String> c) {
        toStream().forEach(c);
    }

    public void demoForEach() {
        demoForEach(System.out::print);
    }


    // TODO - Demo For Each Ordered
    public void demoForEachOrdered(Consumer<String> c) {
        toStream().forEachOrdered(c);
    }

    public void demoForEachOrdered() {
        demoForEach(System.out::print);
    }


    // TODO - Demo To List
    public List<String> toList() {
        return toStream().collect(Collectors.toList());
    }


    // TODO - Demo To Array
    public String[] toArray() {
        return toStream().toArray(String[]::new);
    }


    public Map<Integer, String> toMap() {
        return toStream().collect(Collectors.toMap(String::hashCode, String::toString));
    }

    public String toJoiningString() {
        return toStream().collect(Collectors.joining());
    }

    public Map<String, List<Locale>> groupingByDemo() {
        Stream<Locale> locales = LocaleFactory.createLocaleStream(999);
        return locales.collect(Collectors.groupingBy(Locale::getCountry));
    }


    public Map<Boolean, List<String>> partitioningByDemo() {
        Stream<String> stringStream = stringList.stream();
        Predicate<String> predicate = s -> s.startsWith("A");
        Collector<String, ?, Map<Boolean, List<String>>> stringMapCollector = Collectors.partitioningBy(predicate);
        Map<Boolean, List<String>> partitionedStream = stringStream.collect(stringMapCollector);

        return partitionedStream;
    }


}
