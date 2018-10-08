package rocks.zipcodewilmington.week8.p10052018;

import rocks.zipcodewilmington.Person;

/**
 * @author leon on 05/10/2018.
 */
public interface Food {
    void getEaten(Person p);
    void addTopping(Topping... topping);
}
