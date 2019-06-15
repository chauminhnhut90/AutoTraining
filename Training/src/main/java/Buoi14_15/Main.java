package Buoi14_15;

import com.beust.jcommander.internal.Lists;
import org.testng.TestNG;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TestNG testng = new TestNG();

        List<String> list = Lists.newArrayList();
        list.add("./src/main/resources/testng.xml");
        testng.setTestSuites(list);

        testng.run();
    }
}
