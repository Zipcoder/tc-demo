package rocks.zipcodewilmington.week4.p07032018Tuesday;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 7/3/18.
 */
public class MainApplication {



    public static void printKeysetThenValues() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        for(String key : map.keySet()) {
            System.out.println(key);
        }


        for(Integer val : map.values()) {
            System.out.println(val);
        }
    }

    public static void useOverEngineeredMapToPrintEntrySet() {
        OverEngineeredMap<String, Integer> map = new OverEngineeredMap<>(new TreeMap());
        map.add("One", 1);
        map.add("Two", 2);
        map.add("Three", 3);

        map.printEntrySet();
    }
}
