package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.week8.p10022018.Persons;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 02/10/2018.
 */
public class PersonsTest {
    private Persons persons1;
    private Persons persons2;

    @Before
    public void setupWithAList() {
        // Given
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person(0, "Leon", null);
        Person p2  = new Person(1, "Froilan", null);
        Person p3 = new Person(2, "Tariq", null);

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        this.persons1 = new Persons(personList);
        this.persons2 = new Persons(
                new Person(0,  "Leon", null),
                new Person(1,  "Froilan", null),
                new Person(2,  "Tariq", null));
    }


    @Test
    public void test() {
        // when
        String persons1State = persons1.toString();
        String persons2State = persons2.toString();

        // then
        System.out.println(persons1State);
        System.out.println(persons2State);
    }
}
