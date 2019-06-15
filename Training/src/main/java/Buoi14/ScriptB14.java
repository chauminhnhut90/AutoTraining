package Buoi14;

import org.testng.annotations.Test;

public class ScriptB14 {

    @Test (timeOut = 5000)
    public void test(){
        try {
            Thread.sleep(4000);
            System.out.println("login");
        }catch (Exception ex){}
    }
}
