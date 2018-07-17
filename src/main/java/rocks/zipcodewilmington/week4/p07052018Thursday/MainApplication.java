package rocks.zipcodewilmington.week4.p07052018Thursday;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 7/4/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("One", 2);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println(lookUpByValue(map, 2));

    }

    public static String lookUpByValue(Map<String, Integer> map, Object valSpecified) {
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if(value == valSpecified) {
                return key;
            }
        }
        return null;
    }

    public void s() {
        int i =0;
        while(true) {
            if(i > 5) {
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
