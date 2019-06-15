package Buoi14;

public class DataProvider {

    @org.testng.annotations.DataProvider(name = "name1", parallel = true)//rat quan trong parallel = true va set dataprovider trong xml file de tan dung toi da chay song song trong provider
    public Object[][] dataProviderMethod() {
        return new Object[][] {
                { "data one","Trinh","123456" },
                { "data two","Nhut","123456" },
                { "data three","Tuyen","123456" }, //3 dong 3 cot
        };
    }

//    @org.testng.annotations.DataProvider(name = "name2", parallel = true)
//    public Object[][] dataProviderMethod2() {
//        return new Object[][] {
//                { "data one","Trinh","123456" },
//                { "data two","Nhut","123456" },
//                { "data three","Tuyen","123456" }, //3 dong 3 cot
//        };

}
