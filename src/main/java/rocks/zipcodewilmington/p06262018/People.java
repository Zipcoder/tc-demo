package rocks.zipcodewilmington.p06262018;

import java.util.ArrayList;

/**
 * @author leon on 6/26/18.
 */
public class People {
    ArrayList<FunnyPerson> personList = new ArrayList<FunnyPerson>();

    public void add(FunnyPerson personToBeAddedToList) {
        personList.add(personToBeAddedToList);
    }

    public void remove(FunnyPerson personToBeRemovedFromList) {
        personList.remove(personToBeRemovedFromList);
    }

    public FunnyPerson getPersonById(Integer id) {
        for(FunnyPerson person : personList) {
            if(person.getId()==id) {
                return person;
            }
        }
        return null;
    }
}
