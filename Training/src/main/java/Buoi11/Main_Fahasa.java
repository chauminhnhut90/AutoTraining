package Buoi11;

import com.beust.jcommander.internal.Lists;
import org.testng.TestNG;
import java.util.List;

/**
 * @author tuyennguyen
 * @since 19/05/2019
 * */

public class Main_Fahasa {
    /*Liệt kê toàn bộ sách trong các mục bên dưới, mỗi sách phải liêt kê ra đầy đủ thông tin mà sách đó đang hiển thị.
    VD: Tên sách, giá tiền, rating… (áp dụng POM) của trang https://www.fahasa.com
    * NỔI BẬT,
    * DEALS 24H - SÁCH TIẾNG VIỆT,
    * VĂN HỌC
    * LỚP HỌC MẬT NGỮ*/
    public static void main(String[] args){
        TestNG testng = new TestNG();

        List<String> list = Lists.newArrayList();
        list.add("./src/main/resources/testng.xml");
        testng.setTestSuites(list);

        testng.run();



    }



}
