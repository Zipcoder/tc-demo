package rocks.zipcodewilmington.week4.p07052018Wednesday;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 7/5/18.
 */
public class MyCollection<E> extends AbstractCollection<E>  {
    private final Iterable<E> iterable;
    public MyCollection(Iterable<E> iterable) {  this.iterable = iterable; }

    @Override
    public Iterator<E> iterator() {  return iterable.iterator(); }

    @Override
    public int size() {
        List<E> list = new ArrayList<>();
        iterator().forEachRemaining(list::add);
        return list.size();
    }
}
