package Buoi12;

import org.testng.annotations.Test;

public class AlwaysRun {

    //    @Test (invocationCount = 10, invocationTimeOut = 10000) //set so lan chay cho 1 testcase
//    public void Login(){
//        sleep();
//        System.out.println("Login");
//    }
    @Test
    public void Testcase1() {
        sleep();
        System.out.println("testcase1");
    }

    @Test
    public void Testcase2() {
        sleep();
        System.out.println("testcase2");
    }

    @Test
    public void Testcase3() {
        sleep();
        System.out.println("testcase3");
    }

    @Test
    public void Testcase4() {
        sleep();
        System.out.println("testcase4");
    }

    private void sleep() {
        try {
            Thread.currentThread().sleep(5000);
        } catch (Exception ex) {
        }
    }
//cau hinh chay song song vao config: <suite name="testsuite1" thread-count="2" parallel="methods" >
//thread-count=2 la chay 2 testcase 1 luot
}
