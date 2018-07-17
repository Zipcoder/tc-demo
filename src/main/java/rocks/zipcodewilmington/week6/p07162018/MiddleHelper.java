package rocks.zipcodewilmington.week6.p07162018;

/**
 * @author leon on 7/16/18.
 */
public class MiddleHelper {
    public static <SomeClassType> SomeClassType getMiddle(SomeClassType... a) {
        return a[a.length /2 ];
    }

    public static <T> int getSize(T... a) {
        MiddleHelper.<String>getSize("");
        return a.length;
    }
}
