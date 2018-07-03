package rocks.zipcodewilmington.week4.p07032018Tuesday;

import java.util.Map;
import java.util.Set;

/**
 * @author leon on 7/3/18.
 */
public class OverEngineeredMap<Key, Value> {
    Map<Key, Value> map;

    public OverEngineeredMap(Map<Key, Value> map) {
        this.map = map;
    }

    public void add(Key key, Value value) {
        map.put(key, value);
    }

    public void printEntrySet() {
        Set<Map.Entry<Key, Value>> entrySet = map.entrySet();

        for (Map.Entry<Key, Value> entry : entrySet) {
            Key key = entry.getKey();
            Value val = entry.getValue();

            System.out.println("\n\nThe key is = " + key);
            System.out.println("The val is = " + val);
        }
    }

    public void printKeySet() {
        Set<Key> keySet = map.keySet();
        for(Key key : keySet) {
            System.out.println(key);
        }
    }
}