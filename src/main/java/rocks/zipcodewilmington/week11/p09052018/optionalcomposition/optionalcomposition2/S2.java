package rocks.zipcodewilmington.week11.p09052018.optionalcomposition.optionalcomposition2;

import com.zipcodewilmington.streams.tools.RandomUtils;

/**
 * Created by leon on 6/5/17.
 * Suppose you have a method `f` yielding an `Optional<T>`
 */
public class S2 {
    public T2 f() {
        if (RandomUtils.createBoolean(50)) {
            return new T2();
        } else {
            return null;
        }
    }
}