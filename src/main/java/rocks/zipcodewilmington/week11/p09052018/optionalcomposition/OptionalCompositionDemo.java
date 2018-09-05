package rocks.zipcodewilmington.week11.p09052018.optionalcomposition;
import com.zipcodewilmington.streams.demos.lecture2.optionalcomposition.optionalcomposition1.*;
import com.zipcodewilmington.streams.demos.lecture2.optionalcomposition.optionalcomposition2.*;

import java.util.Optional;

/**
 * Created by leon on 6/5/17.
 */ // TODO - Demo
public class OptionalCompositionDemo {
    public U2 noComposition() {
        S2 s = new S2();
        return s.f().g();
    }

    public Optional<Optional<U1>> nestedComposition() {
        S1 s = new S1();
        return s.f().map(T1::g);
    }

    public Optional<U1> flatComposition() {
        S1 s = new S1();
        return s.f().flatMap(T1::g);
    }
}
