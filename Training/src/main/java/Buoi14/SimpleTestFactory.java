package Buoi14;

public class SimpleTestFactory {

    @org.testng.annotations.Factory
    public Object[] factoryMethod() {
        return new Object[] {
                new SimpleTest("ti"),
                new SimpleTest("teo"),
        };
    }
}
