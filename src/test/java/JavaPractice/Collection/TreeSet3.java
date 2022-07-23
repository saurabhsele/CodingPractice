package JavaPractice.Collection;

import java.util.TreeSet;

/**
 * https://www.javatpoint.com/java-treeset
 */
public class TreeSet3 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(24);
        treeSet.add(-66);
        treeSet.add(-66);
        treeSet.add(12);
        treeSet.add(15);

        System.out.println("treeSet : " + treeSet);
        System.out.println("treeSet : " + treeSet.first());
        System.out.println("Highest Value: " + treeSet.pollFirst());
        System.out.println("Lowest Value: " + treeSet.pollLast());

        System.out.println("treeSet : true " + treeSet.headSet(66, true));
    }
}
