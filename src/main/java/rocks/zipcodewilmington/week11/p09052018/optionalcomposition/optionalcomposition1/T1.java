package rocks.zipcodewilmington.week11.p09052018.optionalcomposition.optionalcomposition1;

import com.zipcodewilmington.streams.tools.RandomUtils;

import java.util.Optional;

/**
 * Suppose you have a method `g` yielding an `Optional<U>`
 */
public class T1 {
    public Optional<U1> g() {
        return Optional.of(createClassU());
    }

    private U1 createClassU() {
        if (RandomUtils.createBoolean(50)) {
            return new U1();
        } else {
            return null;
        }
    }
}