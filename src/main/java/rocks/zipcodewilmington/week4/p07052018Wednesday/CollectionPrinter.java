package rocks.zipcodewilmington.week4.p07052018Wednesday;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 7/4/18.
 */
public class CollectionPrinter {
    public static void print(Iterable<Object> iterables) {
        List<Object> elementList = new ArrayList<>();
        iterables.iterator().forEachRemaining(elementList::add);
        for (int currentIndex = 0; currentIndex < elementList.size(); currentIndex++) {
            Object currentElement = elementList.get(currentIndex);
            System.out.println(new StringBuilder()
                    .append("\n\nList = " + elementList)
                    .append("\nCurrent Index = " + currentIndex)
                    .append("\nCurrent Element = " + currentElement)
                    .toString());
        }
    }
}
