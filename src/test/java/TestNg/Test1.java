package TestNg;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Test1 {

    @Test(dataProviderClass = DataProviderTest.class, dataProvider = "getData")
    public void test1(int a, int b){
        System.out.println("a :"+a +"     "+"b :"+b);
    }

    @Test
    public void  tes2(){
        String num = "1210";
        int[] freqArr = new int[10];  // n = 10 given in constraints;


        for(char ch : num.toCharArray()){
            freqArr[ch-'0']++;
        }

        for( int c : freqArr){
            System.out.print(c );
        }
        System.out.println(Arrays.toString(Arrays.stream(freqArr).toArray()));
    }

    @Test
    public void test3(){
        System.out.println("0".equals("1"));
    }
}
