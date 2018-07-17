package rocks.zipcodewilmington.week4.p07052018Thursday;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author leon on 7/4/18.
 */
public class CollectionPrinterTest {
    @Test
    public void printAsIterableTest() {
        CollectionPrinter.printIterable(Arrays.asList("The Quick Brown Fox Jumps".split(" ")));
    }

    @Test
    public void printAsListTest() {
        CollectionPrinter.printIterableAsList(Arrays.asList("The Quick Brown Fox Jumps".split(" ")));
    }
}
