package Buoi12;

import org.testng.annotations.Test;

public class NewDemo {

    @Test(invocationCount = 10, invocationTimeOut = 10000, threadPoolSize = 5)
    //threadPoolSize = 5 chay song song trong cung 1 test case, tao ra 5 cai pool de chay test case nay
    public void test(){
        System.out.println(Thread.currentThread().getName());
        //in ra luong dang chay testcase nay
    }
}
