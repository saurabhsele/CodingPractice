package JavaPractice.Collection.JavaException;

import JavaPractice.Collection.JavaException.CustomeExceptions.InvalidAgeException;

public class TestCustomException {

    public static void validateAge(int age) throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("Not valid"+age);
    }

    public static void main(String[] args) {
        try {
            validateAge(193);
        }catch (Exception e)
        {
            System.out.println("Exception occured : "+e);
        }

        System.out.println("rest of the code");
    }
}
