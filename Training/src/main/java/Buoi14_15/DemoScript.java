package Buoi14_15;

import org.testng.annotations.Test;

public class DemoScript {
    //https://howtodoinjava.com/testng/testng-test-groups-meta-group-default-group-examples/

    @Test(groups = {"group_1","group_2"})
    public void testcase1(){
        System.out.println("testcase 1");
    }

    @Test(groups = "group_1")
    public void testcase2(){
        System.out.println("testcase 2");
    }

    @Test(groups = "group_2")
    public void testcase4(){
        System.out.println("testcase 4");
    }

    @Test(dependsOnGroups = "group_2")
    public void testcase3(){
        System.out.println("testcase 3");
    }

    @Test(parameters = {"user","pass"})
    public void welcome(String user, String pass){
        System.out.println("welcome " +user + " "+ pass);
    }

    @Test(timeOut = 5000)
    public void login(){
        try{
            Thread.sleep(4000);
            System.out.println("login");
        }
        catch (Exception ex){
        }
    }




}
