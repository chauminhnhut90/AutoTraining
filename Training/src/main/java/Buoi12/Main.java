package Buoi12;
import org.testng.TestNG;
import org.testng.collections.Lists;
import java.util.List;


public class Main {
    public static void main(String[] args){

        TestNG testng = new TestNG();
        List<String> suites = Lists.newArrayList();
        suites.add("./src/main/resources/testng.xml");

        testng.setTestSuites(suites);
        testng.run();

    }
    //@Test kiem tra xem Testng co'work ko?


}
