public class BaiTapVeNha7 {

    public static void main(String[] args) {

        int bai82 = bai82(20, 7, 15);
        inSo(bai82);

        bai83(1, -80);

        int bai84 = bai84(20, 100);
        inSo(bai84);

        bai85(12);



    }

    private static int bai82(int a, int b, int c) {
        //Bài 82: Viết chương trình tìm số lớn nhất trong 3 số thực a, b, c
        int max = 0;

        if (max < a)
            max = a;

        if (max < b)
            max = b;

        if (max < c)
            max = c;

        return max;
    }

    private static void bai83(int a, int b) {
        //Bài 83: Viết chương trình nhập 2 số thực, kiểm tra xem chúng có cùng dấu hay không

        if (a * b > 0) {
            System.out.println("cung dau");
        } else {
            System.out.println("Khong cung dau");
        }

    }

    private static int bai84(int a, int b) {
        //Bài 84: Viết chương trình giải và biện luận phương trình bậc nhất ax + b = 0
        int x = 0;
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }

        } else {
            x = -b / a;
        }

        return x;
    }

    private static void bai85(int t) {
        //Bài 85: Nhập vào tháng của 1 năm. Cho biết tháng thuộc quý mấy trong năm

        if (t>=1 && t<=12){
            if (t == 1||t == 2 || t == 3)
                System.out.println("Thang thuoc quy 1");

            if (t == 4 || t == 5 || t == 6)
                System.out.println("Thang thuoc quy 2");

            if (t == 7 || t == 8 || t == 9)
                System.out.println("Thang thuoc quy 3");

            if (t == 10 || t == 11 || t == 12)
                System.out.println("Thang thuoc quy 4");

        }else {
            System.out.println("Thang invalid");
        }


    }



    private static void inSo ( int number){
            System.out.println(number);
        }

    }
