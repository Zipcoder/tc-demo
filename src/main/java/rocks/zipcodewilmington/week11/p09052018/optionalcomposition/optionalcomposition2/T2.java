package rocks.zipcodewilmington.week11.p09052018.optionalcomposition.optionalcomposition2;

import com.zipcodewilmington.streams.tools.RandomUtils;

/**
 * Suppose you have a method `g` yielding an `Optional<U>`
 */
public class T2 {
    public U2 g() {
        if (RandomUtils.createBoolean(50)) {
            return new U2();
        } else {
            return null;
        }
    }
}