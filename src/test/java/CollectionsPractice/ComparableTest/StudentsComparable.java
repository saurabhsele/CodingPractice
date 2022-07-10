package CollectionsPractice.ComparableTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentsComparable implements Comparable<StudentsComparable> {

    int stdAge;
    String stdName;
    int rollNumber;

    StudentsComparable(int stdAge, String stdName, int rollNumber){
        this.stdAge = stdAge;
        this.stdName = stdName;
        this.rollNumber = rollNumber;
    }

    @Override
    public int compareTo(StudentsComparable studentsComparable) {

        return Integer.compare(stdAge, studentsComparable.stdAge);
//        if (stdAge == studentsComparable.stdAge)
//            return 0;
//        else if (stdAge > studentsComparable.stdAge)
//            return 1;
//        else
//            return -1;

    }

    public static void main(String[] args) {
        ArrayList<StudentsComparable> studentsComparableArrayList= new ArrayList<>();
        studentsComparableArrayList.add(new StudentsComparable(21,"Anuj",12));
        studentsComparableArrayList.add(new StudentsComparable(28,"Askash",42));
        studentsComparableArrayList.add(new StudentsComparable(30,"dipti",72));
        Collections.sort(studentsComparableArrayList);

        for (StudentsComparable sd: studentsComparableArrayList) {
            System.out.println(sd.stdAge+" "+ sd.stdName+" "+ sd.rollNumber);
        }
    }
}
