package rocks.zipcodewilmington.week6.p07162018;

/**
 * @author leon on 7/16/18.
 */
public class GenericContainer<T> {
    private T element;

    public T get() {
        return element;
    }

    public void put(T item) {
        element = item;
    }

}