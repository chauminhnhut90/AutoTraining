package Buoi14_15;

import org.testng.annotations.Test;

public class SimpleTest {
    String name;

    public SimpleTest(String name){
        this.name = name;
    }

    @Test
    public void simpleTestOne() {
        System.out.println("Simple Test One Method." + name);
    }

    @Test
    public void simpleTestTwo() {
        System.out.println("Simple Test Two Method." + name);
    }
}
