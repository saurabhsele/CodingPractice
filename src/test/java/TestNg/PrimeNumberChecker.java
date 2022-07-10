package TestNg;

public class PrimeNumberChecker {
    public Boolean validate(final Integer primeNumber) {

        for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();
        System.out.println(primeNumberChecker.validate(293));
    }
}
