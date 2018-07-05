package rocks.zipcodewilmington.week4.p07052018Wednesday;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 7/4/18.
 */
public class CollectionPrinter {

    /**
     * Notice the simple, potentially underwhelming, information being added to the print statements
     *
     * @param iterable
     */

    public static void printIterable(Iterable<Object> iterable) {
        Iterator iterator = iterable.iterator();
        while(iterator.hasNext()) {
            System.out.println("Current Element = " + iterator.next());
        }
    }

    /**
     * Notice the additional, potentially cumbersome, information being added to the print statements
     *
     * @param iterable iterable object to be converted to list to demonstrate ¿something?
     */
    public static void printIterableAsList(Iterable<Object> iterable) {
        List<Object> listToPopulate = new ArrayList<>();
        iterable.iterator().forEachRemaining(listToPopulate::add);
        StringBuilder sb = new StringBuilder().append("\n\nList = " + listToPopulate);
        for (int currentIndex = 0; currentIndex < listToPopulate.size(); currentIndex++) {
            Object currentElement = listToPopulate.get(currentIndex);
            sb
                    .append("\n\nCurrent Index = " + currentIndex)
                    .append("\nCurrent Element = " + currentElement)
                    .toString();
        }
        System.out.println(sb);
    }

    public static void printAsIterableForLoop(Iterable<Object> iterable) {
        Iterator iterator = iterable.iterator();
        for (Object currentElement = null; iterator.hasNext(); currentElement = iterator.next()) {
            System.out.println("Current Element = " + currentElement);
        }
    }
}
