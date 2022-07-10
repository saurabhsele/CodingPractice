package TestNg;

import org.testng.annotations.DataProvider;

public class DataProviderTest {

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {1,2},
                {4,5},
                {7,8},
        };
    }
}
