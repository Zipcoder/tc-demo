package rocks.zipcodewilmington.week11.p09052018;

import java.util.function.*;

/**
 * @author leon on 9/5/18.
 */
public class LambdaDemo {
    public static void main(String[] args) {
        Runnable r =
                () -> System.out.println("Hello World");

        Consumer<String> c =
                string -> System.out.println(string);

        Supplier<Double> s =
                Math::random;

        Function<String, Integer> f =
                string -> string.length();

        Predicate<Integer> p =
                someInteger -> someInteger % 2 == 0;

        BiFunction<Object, Integer, String> bf =
                (object, integer) -> object.toString() + integer.toString();

        BiConsumer<String, Integer> b =
                (strVal, intVal) -> {
                    System.out.println("The string value is " + strVal);
                    System.out.println("The integer value is " + intVal);
                };
    }
}
