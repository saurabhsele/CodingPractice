package TestNg;

import org.testng.annotations.Test;

public class Test1 {

    @Test(dataProviderClass = DataProviderTest.class, dataProvider = "getData")
    public void test1(int a, int b){
        System.out.println("a :"+a +"     "+"b :"+b);
    }
}
