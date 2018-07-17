package rocks.zipcodewilmington.week6.p07172018;

import rocks.zipcodewilmington.week6.p07172018.marketplace.spices.Salt;
import rocks.zipcodewilmington.week6.p07172018.marketplace.spices.SpiceAisle;

/**
 * @author leon on 7/17/18.
 */
public class MainApp {
    public static void main(String[] args) {
        SpiceAisle<Salt> saltAisle = new SpiceAisle<>();
        Salt[] saltArray = SpiceFactory.createSalts(10);
        saltAisle.stockAll(saltArray);

        for(Salt salt : saltAisle) {
            System.out.println(salt);
        }
    }
}
