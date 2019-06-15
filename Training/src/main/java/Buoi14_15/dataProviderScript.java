package Buoi14_15;

import org.testng.annotations.Test;

public class dataProviderScript {
    @Test(dataProvider = "name1",dataProviderClass = dataProviderClass.class)
    public void login(String user, String pass) {
        try{
            Thread.sleep(3000);
        }catch (Exception ex){

        }
        System.out.println(user + "-" + pass);
    }

    @Test
    public void register(){
        try{
            Thread.sleep(3000);
        }catch (Exception ex){

        }
        System.out.println("register");
    }

    @Test
    public void about(){
        try{
            Thread.sleep(3000);
        }catch (Exception ex){

        }
        System.out.println("about");
    }
}
