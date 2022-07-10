package CollectionsPractice.ComparatorTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AgeStudent implements Comparator<Students> {

    public static void main(String[] args) {
        ArrayList<Students> studentsComparableArrayList= new ArrayList<>();
        studentsComparableArrayList.add(new Students(211,44, "Anuj"));
        studentsComparableArrayList.add(new Students(28,60,"Askash"));
        studentsComparableArrayList.add(new Students(30,68,"dipti"));
        studentsComparableArrayList.sort(new AgeStudent());

        for (Students sd: studentsComparableArrayList) {
            System.out.println(sd.stdAge+" "+ sd.stdRollNumber+" "+ sd.stdName);
        }
    }

    @Override
    public int compare(Students s1, Students s2) {
        return Integer.compare(s1.stdAge, s2.stdAge);
    }
}
