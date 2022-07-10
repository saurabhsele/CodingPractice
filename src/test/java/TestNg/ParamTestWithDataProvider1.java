package TestNg;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * https://www.tutorialspoint.com/testng/testng_parameterized_test.htm
 */
public class ParamTestWithDataProvider1 {
    private PrimeNumberChecker primeNumberChecker;

    @BeforeMethod
    public void initialize() {
        primeNumberChecker = new PrimeNumberChecker();
    }

    @DataProvider(name = "test1")
    public static Object[][] primeNumbers() {
        return new Object[][] {
                {2, true},
                {6, false},
                {19, true},
                {22, false},
                {23, true}
        };
    }
// https://www.toolsqa.com/testng/testng-dataproviders/
    @DataProvider (name = "data-provider", parallel = true)
    public Object[][] dpMethod (Method m){
        switch (m.getName()) {
            case "Sum":
                return new Object[][] {{2, 3 , 5}, {5, 7, 9}};
            case "Diff":
                return new Object[][] {{2, 3, -1}, {5, 7, -2}};
        }
        return null;
    }

    // This test will run 4 times since we have 5 parameters defined
    @Test(dataProvider = "test1")
    public void testPrimeNumberChecker(Integer inputNumber, Boolean expectedResult) {
        System.out.println(inputNumber + " " + expectedResult);
        Assert.assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
    }

    @Test (dataProvider = "data-provider")
    public void Sum (int a, int b, int result) {
        int sum = a + b;
        Assert.assertEquals(result, sum);
    }

    @Test (dataProvider = "data-provider")
    public void Diff (int a, int b, int result) {
        int diff = a - b;
        Assert.assertEquals(result, diff);
    }
}