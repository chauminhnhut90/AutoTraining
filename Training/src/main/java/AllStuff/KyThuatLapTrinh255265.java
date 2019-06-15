package AllStuff;

public class KyThuatLapTrinh255265 {
    public static void main(String[] args){
    }

    public static int bai255(int[] array){
        //Bài 225: Đếm số lượng giá trị lớn nhất có trong mảng
       int count = 0;
       int n = array.length;
       for (int i = 0; i<n;i++ ){
           if (i<n)
               i=n;
           count +=1;
       }
       return  count;

    }

    public static void inso(int number){
        System.out.print(number);
    }
}
