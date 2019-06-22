package BaiTapBuoi15;

import org.testng.TestNG;
import org.testng.collections.Lists;
import java.util.List;

public class MainB15 {
    public void main(String[] args){
        TestNG testNG = new TestNG();
        List<String> suites = Lists.newArrayList();
        suites.add(".src/main/resources/testng.xml");
        testNG.setTestSuites(suites);
        testNG.run();
    }
}
