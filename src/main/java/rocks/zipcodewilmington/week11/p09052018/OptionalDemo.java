package rocks.zipcodewilmington.week11.p09052018;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by leon on 6/1/17.
 */ // TODO - Demo
public class OptionalDemo {
    private final Stream<String> stringStream;

    /**
     * Constructor
     */
    public OptionalDemo(Stream<String> stringStream) {
        this.stringStream = stringStream;
    }

    public Optional<String> demoFindAny() {
        return stringStream.filter(string -> string.startsWith("Q")).findAny();
    }

    public String demoOrElse() {
        Optional<String> optionalString = demoFindAny();
        String result = optionalString.orElse("Alternative value if empty");
        return result;
    }


    public String demoOrElseGet() {
        Optional<String> optionalString = demoFindAny();
        String result = optionalString.orElseGet(() -> System.getProperty("user.name"));
        return result;
    }

    public String demoOrElseThrow() throws Exception {
        Optional<String> optionalString = demoFindAny();
        String result = optionalString.orElseThrow(Exception::new);
        return result;
    }

    public ArrayList<String> demoIfPresent1() {
        ArrayList<String> arrayList = new ArrayList<String>();
        Optional<String> optionalString = demoFindAny();
        optionalString.ifPresent(string -> arrayList.add(string));
        return arrayList;
    }

    public ArrayList<String> demoIfPresent2() {
        ArrayList<String> arrayList = new ArrayList<String>();
        Optional<String> optionalString = demoFindAny();
        optionalString.ifPresent(arrayList::add);
        return arrayList;
    }

    public Optional<Double> inverse1(double x) {
        return x == 0 ? Optional.empty() : Optional.of(1 / x);
    }

    public Optional<Double> inverse2(double x) {
        return x == 0 ? Optional.of(null) : Optional.of(1 / x);
    }

    public Optional<Double> squareRoot(Double x) {
        return x < 0 ? Optional.empty() : Optional.of(Math.sqrt(x));
    }

    public Optional<Double> squareRootInverse(Double x) {
        //return Optional.of(-4.0).flatMap(OptionalDemo::inverse1).flatMap(OptionalDemo::squareRoot);
        return Optional.of(-4.0).flatMap(d -> inverse1(d)).flatMap(d -> squareRoot(d));
    }

    public Optional<String> zyg(String x) {
        return x == null ? Optional.of(null) : Optional.of(x.toLowerCase());
    }

    public String improperUsage1() {
        String stringValue = null;
        Optional<String> optionalString = zyg("string value");
        return optionalString.orElse("Alternative value");
    }

    public String improperUsage2() {
        String stringValue = null;
        return stringValue.toLowerCase();
    }
}
