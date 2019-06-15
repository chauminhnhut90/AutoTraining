package Buoi12;

import org.testng.annotations.*;

public class TestCases {

    @BeforeSuite
    public void testcase1(){
        System.out.println("BeforeSuite");
    }

    @AfterSuite
    public void testcase2(){
        System.out.println("AfterSuite");
    }

    @BeforeTest
    public void testcase3(){
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void testcase4(){
        System.out.println("AfterTest");
    }

    @BeforeGroups
    public void testcase5(){
        System.out.println("BeforeGroups");
    }

    @AfterGroups
    public void testcase6(){
        System.out.println("AfterGroups");
    }

    @BeforeClass
    public void testcase7(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void testcase8(){
        System.out.println("AfterClass");
    }

    @BeforeMethod
    public void testcase9(){
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    public void testcase10(){
        System.out.println("AfterMethod");
    }
    @Test
    public void testcase(){
        System.out.println("TESTCASE");
    }

}
