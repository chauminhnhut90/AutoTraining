package Buoi14;

import org.testng.annotations.Test;

public class SimpleTest {
    String name;

    public SimpleTest(String name){
        this.name = name;
    }

    @Test
    public void simpleTest() {
        System.out.println("Simple Test Method." + name);
    }

    @Test
    public void simpleTest1() {
        System.out.println("Simple Test Method 1." + name);
    }

}
