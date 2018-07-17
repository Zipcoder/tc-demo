package rocks.zipcodewilmington.week6.p07172018;

import rocks.zipcodewilmington.week6.p07172018.marketplace.spices.Cinnamon;
import rocks.zipcodewilmington.week6.p07172018.marketplace.spices.Ginger;
import rocks.zipcodewilmington.week6.p07172018.marketplace.spices.Salt;

/**
 * @author leon on 7/17/18.
 */
public class SpiceFactory {
    public static Salt[] createSalts(int numberOfElements) {
        Salt[] saltArray = new Salt[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            Long serialNumber = System.nanoTime();
            saltArray[i] = new Salt(serialNumber);
        }
        return saltArray;
    }

    public static Ginger[] createGingers(int numberOfElements) {
        Ginger[] gingerArray = new Ginger[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            Long serialNumber = System.nanoTime();
            gingerArray[i] = new Ginger(serialNumber);
        }
        return gingerArray;
    }

    public static Cinnamon[] createCinnamons(int numberOfElements) {
        Cinnamon[] cinnamonArray = new Cinnamon[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            Long serialNumber = System.nanoTime();
            cinnamonArray[i] = new Cinnamon(serialNumber);
        }
        return cinnamonArray;
    }
}
