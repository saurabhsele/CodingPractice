package JavaPractice.Collection;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.geeksforgeeks.org/find-winner-election-votes-represented-candidate-names/?ref=rp
 */
public class ElectoralVotingBallot {

    public static String findWinner(String[] votes) {

        int maxValueInMap = 0;
        String winner = "";

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String str : votes) {
            if (hashMap.containsKey(str))
                hashMap.put(str, hashMap.get(str) + 1);
            else
                hashMap.put(str, 1);
        }
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (value > maxValueInMap) {
                maxValueInMap = value;
                winner = key;
            } else if (value == maxValueInMap && winner.compareTo(key) > 0) {
                winner = key;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        String[] votes = {"john", "johnny", "jackie",
                "johnny", "john", "jackie",
                "jamie", "jamie", "john",
                "johnny", "jamie", "johnny",
                "john"};

        System.out.println(findWinner(votes));
    }
}
