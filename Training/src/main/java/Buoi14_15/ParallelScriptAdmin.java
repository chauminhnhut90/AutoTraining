package Buoi14_15;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelScriptAdmin {
    @BeforeMethod
    public void beforeMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("beforeMethod-admin. Thread id is: " + id);
    }

    @Test
    public void testMethodsOne() {
        long id = Thread.currentThread().getId();
        System.out.println("testMethodsOne-admin. Thread id is: " + id);
    }

    @Test
    public void testMethodsTwo() {
        long id = Thread.currentThread().getId();
        System.out.println("testMethodsTwo-admin. Thread id is: " + id);
    }

    @AfterMethod
    public void afterMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("afterMethod-admin. Thread id is: " + id);
    }
}
