package Buoi14_15;

import org.testng.annotations.Factory;

public class SimpleTestFactory {
    @Factory
    public Object[] factoryMethod() {
        return new Object[] {
                new SimpleTest("Ti"),
                new SimpleTest("Teo")
        };
    }
}
