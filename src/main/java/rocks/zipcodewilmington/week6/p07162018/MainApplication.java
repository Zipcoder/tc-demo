package rocks.zipcodewilmington.week6.p07162018;

import java.util.ArrayList;

/**
 * @author leon on 7/16/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        demoLameInheritanceNuance();
    }

    public static void demoLameInheritanceNuance() {
        ArrayList<Long> longList = null;
        System.out.println(longList instanceof ArrayList);
        Long l = 10L;
        System.out.println(l instanceof Number);
    }

    public static void demoPair() {
        Pair<Integer, Integer> pair = new Pair<>(1, 2);
        int retrievedValue = pair.getVal1();
    }

    public static void demoGenericContainer() {
        GenericContainer<String> container = new GenericContainer<>();
        String valueToStore = "Hello world";
        container.put(valueToStore);
        String valueThatHasBeenStored = container.get();
    }


    public static void demoObjectContainer() {
        ObjectContainer container = new ObjectContainer();
        Integer valueToStore = 5;
        container.put(valueToStore);
        String valueThatHasBeenStored = (String)container.get();
    }
}
