package rocks.zipcodewilmington.week8.p10022018;

import rocks.zipcodewilmington.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 02/10/2018.
 */
public class Persons {
    private List<Person> personList;

    public Persons(List<Person> personList) {
        this.personList = personList;
    }


    public Persons(Person... personArray) {
        this(new ArrayList<>(Arrays.asList(personArray)));
    }

    @Override
    public String toString() {
        return "Persons{" +
                "personList=" + personList.toString() +
                '}';
    }
}
