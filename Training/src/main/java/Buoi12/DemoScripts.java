package Buoi12;

import org.testng.annotations.Test;

public class DemoScripts {

    @Test (priority = 2)//danh dau la 1 test case va chay theo thu tu alphabet
    public void testCaseB(){
        System.out.println("Test B .......");
    }

    @Test(priority = 3)//priority do uu tien
    public void testCaseA1(){
        System.out.println("Test A .......");
    }

    @Test(dependsOnMethods = "testCaseA1", enabled = true)//phu thuoc vao ket qua thangang a1
    public void testCaseA2(){
        System.out.println("Test A .......");
    }

//    @Test(priority = 1)
//    public void testCaseC(){
//        System.out.println("Test c .......");
//    }

    @Test (alwaysRun = true) //luon luon chay
    public void testCaseA5(){
        System.out.println("Test A .......");
    }


}
