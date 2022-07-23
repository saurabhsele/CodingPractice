package JavaPractice.Collection;

import java.util.*;

public class setExample {
    public static void main(String[] args) {
        // https://www.javatpoint.com/set-in-java
        // creating LinkedHashSet using the Set
        Set<String> data = new LinkedHashSet<>();

        data.add("JavaTpoint");
        data.add("Set");
        data.add("Example");
        data.add("Set");

        System.out.println(data);
    }
}

/*the NavigableSet and SortedSet are both the interfaces. The NavigableSet extends the SortedSet, so it will not retain the insertion order and store the data in a sorted way.
SET : An unordered collection or list in which duplicates are not allowed is referred to as a collection interface.
 */