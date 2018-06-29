package rocks.zipcodewilmington.p06292018Friday;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.Person;

import java.util.Date;

/**
 * @author leon on 6/29/18.
 */
public class TestPerson {
    @Test
    public void testEquality() {
        Date birthdate = new Date();
        Person leon1 = new Person(0, "Leon", birthdate);
        Person leon2 = new Person(0, "Leon", birthdate);

        System.out.println("Leon1's hashcode = " + leon1.hashCode());
        System.out.println("Leon2's hashcode = " + leon2.hashCode());

        boolean outcome = leon1.getName() == leon2.getName();

        Assert.assertTrue(outcome);
    }

    @Test
    public void testPersonPrint() {
        Date birthdate = new Date();
        Person leon1 = new Person(0, "Leon", birthdate);
        System.out.println(leon1);
    }
}
