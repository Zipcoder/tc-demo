package rocks.zipcodewilmington.week4.p07052018Thursday;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * @author leon on 7/4/18.
 */
public class CollectionTests {
    private String[] stringArray;
    private List<String> stringImmutableList;
    private ArrayList<String> stringArrayList;
    private Collection<String> stringCollection;

    @Before
    public void setup() {
        this.stringArray= "The Quick Brown Fox".split(" ");
        this.stringImmutableList = Arrays.asList(stringArray);
        this.stringArrayList = new ArrayList<>(stringImmutableList);
        this.stringCollection = stringArrayList;
    }


    @Test
    public void addElementAlreadyInCollection() {
        Assert.assertTrue(stringCollection.add("Quartz"));
    }


    @Test
    public void addElementNotInCollection() {
        Assert.assertTrue(stringCollection.add("The"));
    }

    @Test
    public void removeElementInCollection() {
        Assert.assertTrue(stringCollection.remove("The"));
    }

    @Test
    public void removeElementNotInCollection() {
        Assert.assertFalse(stringCollection.remove("Quartz"));
    }

    @Test
    public void getSize() {
        // given
        int expected = stringArray.length;

        // when
        int actual = stringCollection.size();

        // then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addNullToSet() {
        Set<String> set = new HashSet<String>(stringArrayList);
        System.out.println(set.add("The"));
        Assert.assertFalse(set.add("The"));
    }
}
