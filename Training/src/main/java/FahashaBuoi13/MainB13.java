package FahashaBuoi13;
import org.testng.TestNG;
import org.testng.collections.Lists;
import java.util.List;

@SuppressWarnings("all")
public class MainB13 {
    public static void main(String[] args){

        TestNG testng = new TestNG();
        List<String> suites = Lists.newArrayList();
        suites.add("./src/main/resources/testng.xml");

        testng.setTestSuites(suites);
        testng.run();

    }
}
