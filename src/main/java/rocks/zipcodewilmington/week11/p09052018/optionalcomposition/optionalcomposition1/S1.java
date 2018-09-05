package rocks.zipcodewilmington.week11.p09052018.optionalcomposition.optionalcomposition1;


import rocks.zipcodewilmington.week11.tools.RandomUtils;

import java.util.Optional;

/**
 * Created by leon on 6/5/17.
 * Suppose you have a method `f` yielding an `Optional<T>`
 */
public class S1 {
    public Optional<T1> f() {
        return Optional.of(createClassT());
    }

    private T1 createClassT() {
        if (RandomUtils.createBoolean(50)) {
            return new T1();
        } else {
            return null;
        }
    }
}

