package Buoi14;

import org.testng.annotations.Test;

public class DataProviderScripts {

    @Test(dataProvider = "name1", dataProviderClass = DataProvider.class)
    //dataProviderClass la tu khoa //dataProviderClass = DataProvider.class khai bao de no hieu cai Dataprovider class
    public void Login(String data, String name, String pass) {
        try {
            Thread.sleep(3000);
        } catch (Exception ex) {
        }

        System.out.println("Data is: " + data + " " + name + " " + pass);
    }

    @Test
    public void about() {
        try {
            Thread.sleep(3000);
        } catch (Exception ex) {
        }
        System.out.println("about");
    }

    @Test
    public void register() {
        try {
            Thread.sleep(3000);
        } catch (Exception ex) {
        }
        System.out.println("rigister");
    }

}

