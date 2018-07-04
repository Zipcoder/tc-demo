package rocks.zipcodewilmington.week4.p07052018Thursday;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author leon on 7/4/18.
 */
public class CollectionTests {
    private String[] stringArray;
    private List<String> stringList;
    private ArrayList<String> stringArrayList;
    private Collection<String> stringCollection;

    @Before
    public void setup() {
        this.stringArray= "The Quick Brown Fox".split(" ");
        this.stringList = Arrays.asList(stringArray);
        this.stringArrayList = new ArrayList<>(stringList);
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
        Assert.assertTrue(stringCollection.remove("Quartz"));
    }
}
