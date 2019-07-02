package buoi16;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "name1")
    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {"nhutcm", "123"},
                {"data two", "zxc"},
                {"data three", "123"}
        };
    }
}
