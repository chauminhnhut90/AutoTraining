package Buoi14;

import org.testng.annotations.Test;

public class GroupAnnotation {

    @Test(groups = {"group_1","group_2" })
    public void testcase1(){
        System.out.println("Testcase1");
    }

    @Test(groups = "group_1")
    public void testcase2(){
        System.out.println("Testcase2");
    }

    @Test(groups = "group_2")
    public void testcase3(){
        System.out.println("Testcase3");
    }

    @Test(dependsOnGroups = "group_2")
    public void testcase4(){
        System.out.println("Testcase4");
    }
}
