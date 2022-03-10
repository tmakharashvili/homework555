package home;

import org.testng.annotations.*;

public class Testannotations {
    @Test
    public void test1 () {System.out.println("test case one");}
    @Test
    public void test2 () {System.out.println("test case two");}
    @BeforeMethod
    public void beforeMethod () {System.out.println("before method");}
    @AfterMethod
    public void afterMethod () {System.out.println("after method");}
    @BeforeClass
    public void beforeClass () {System.out.println("before class");}
    @AfterClass
    public void afterClass () {System.out.println("after class");}
    @BeforeTest
    public void beforeTest () {System.out.println("before test");}
    @AfterTest
    public void afterTest () {System.out.println("after test");}
    @BeforeSuite
    public void beforeSuit () {System.out.println("before suit");}
    @AfterSuite
    public void afterSuit () {System.out.println("after suit");}

}