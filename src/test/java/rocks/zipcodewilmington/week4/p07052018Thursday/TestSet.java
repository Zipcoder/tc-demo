package rocks.zipcodewilmington.week4.p07052018Thursday;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 7/5/18.
 */
public class TestSet {
    @Test
    public void treeHashSet() {
        Set ts = new HashSet();
        ts.add("The");
        ts.add("Quick");
        ts.add("Brown");
        ts.add("Fox");
        ts.add("jumps");
        ts.add("over");
        ts.add("the");
        System.out.println(Arrays.toString(ts.toArray()));
    }


    @Test
    public void treeSetTest() {
        Set ts = new TreeSet();
        ts.add("The");
        ts.add("Quick");
        ts.add("Brown");
        ts.add("Fox");
        ts.add("jumps");
        ts.add("over");
        ts.add("the");
        System.out.println(Arrays.toString(ts.toArray()));
    }
}
