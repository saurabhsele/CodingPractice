package JavaPractice.Collection;

import org.testng.annotations.Test;

import java.util.TreeMap;

// https://www.geeksforgeeks.org/sorting-hashmap-according-key-value-java/
public class MapPractice {

    @Test
    public void treeMap() {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("saurabh", 32);
        tm.put("roopesh", 31);
        tm.put("harish", 26);
        tm.put("brother", 40);


        System.out.println(tm);
    }
}
