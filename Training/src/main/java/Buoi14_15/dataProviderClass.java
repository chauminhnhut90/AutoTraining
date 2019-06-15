package Buoi14_15;

import org.testng.annotations.DataProvider;

public class dataProviderClass {
    @DataProvider(name = "name1",parallel = true)
    public Object[][] dataProviderMethod() {
        return new Object[][] {
                { "user1","123" },
                { "user2","123456"},
                { "user3","123456"},
                { "user4","123456"},
                { "user5","123456"},
                { "user6","123456"},
                { "user7","123456"},
                { "user8","123456"},
                { "user9","123456"},
                { "user10","123456"}
        };
    }
}
