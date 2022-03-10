package home;

import org.testng.annotations.Test;

public class Ignoretests {
    @Test (enabled = true)
    public void testMethodOne (){
        System.out.println("Test Method One");
    }
    @Test (enabled = false)
    public void testMethodSecond (){
        System.out.println("Test Method Second");
    }
    @Test
    public void testMethodThree (){
        System.out.println("Test Method Three");
    }
}