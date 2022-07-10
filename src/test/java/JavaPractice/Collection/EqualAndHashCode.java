package JavaPractice.Collection;

/**
 * https://www.youtube.com/watch?v=od8legmhJBk&list=RDCMUC3YHhW96LPsAEo45yQSEYIA&index=14
 * Use for primitive type == compare value
 * ex. obj a1   obj a2       a1 == a2 ==> now equal operator will check if both a1 and a2 pointing to same object in memory and not the actual values.
 *
 * Equal() compare reference of two object.

 In simple words, == checks if both objects point to the same memory location whereas .
 equals() evaluates to the comparison of values in the objects.
 If a class does not override the equals method, then by default,
 it uses the equals(Object o) method of the closest parent class that has overridden this method.

 What is difference between == equals () and compareTo () method?
 The 2 main differences are that: equals will take any Object as a parameter,
 but compareTo will only take Strings. equals only tells you whether they're equal or not,
 but compareTo gives information on how the Strings compare lexicographically.

 */
public class EqualAndHashCode {

    public static void main(String[] args) {
        EqualAndHashCode a1 = new EqualAndHashCode();
        EqualAndHashCode a2 = new EqualAndHashCode();

        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));
    }
}
