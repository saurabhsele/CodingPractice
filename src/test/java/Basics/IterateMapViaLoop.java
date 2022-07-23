package Basics;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.youtube.com/watch?v=TCn5oyhipjs
 */
public class IterateMapViaLoop {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("inmobi", 10);
        hm.put("freecharge", 36);
        hm.put("tapzo", 36);
        hm.put("ricoh", 11);

        /**
         * Iterate via forEach loop
         */
        for (Map.Entry<String, Integer> me : hm.entrySet()) {
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }
        /**
         * Iterate via Lambda expression
         */

        hm.forEach((key, value) -> {
            if (key.equals("freecharge")) {
                System.out.println(value);
            }
        });
        /**
         * iterate via stream API
         */

        hm.entrySet().stream().forEach((entry) -> {
            System.out.println(entry.getValue());
            System.out.println(entry.getValue());
        });
    }
}
