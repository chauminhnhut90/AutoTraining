package Buoi14;

import org.testng.annotations.Test;

public class Welcome {

    @Test(parameters = {"user","pass"})
    //Truyen tham so
    public void login(String user, String pass){
        System.out.println("Welcome " + user + " " + pass);

    }
}
