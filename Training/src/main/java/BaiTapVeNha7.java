public class BaiTapVeNha7 {

    public static void main(String[] args) {
        System.out.println("Bai82: Số lớn nhất trong 3 số thực a, b, c la");
        int bai82 = bai82(20, 7, 15);
        inSo(bai82);

        System.out.println("Bai83: Nhập 2 số thực, kiểm tra xem chúng có cùng dấu hay không?");
        bai83(1, -80);

        System.out.println("Bai84: Giải và biện luận phương trình bậc nhất ax + b = 0");
        int bai84 = bai84(20, 100);
        inSo(bai84);

        System.out.println("Bai85: Tháng thuộc quý mấy trong năm?");
        bai85(12);

        System.out.println("Bai86: Tính S(n) = 1^3 + 2^3 + … + N^3");
        int bai86 = bai86(2);
        inSo(bai86);

        System.out.println("Bai87: Tìm số nguyên dương n nhỏ nhất sao cho 1 + 2 + … + n > 10000");
        bai87();

        System.out.println("Bai88: Xuất tất cả các ký tự từ A đến Z");
        bai88();

        System.out.println("Bai89: Tính tổng các giá trị lẻ nguyên dương nhỏ hơn N");
        int bai89 = bai89(9);
        inSo(bai89);

        System.out.println("Bai100: In tất cả các số nguyên dương lẻ nhỏ hơn 100");
        bai90();

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

    private static int bai86(int n){
        //Bài 86: Tính S(n) = 1^3 + 2^3 + … + N^3
        int s = 1;
        for (int i = 1; i<=n; i++){
            s += i*i*i;
        }
        return s;
    }

    private static void bai87(){
        //Bài 87: Tìm số nguyên dương n nhỏ nhất sao cho 1 + 2 + … + n > 10000
        int s=0;
        int n;
        for (n = 0; s<10000; n++){
            s = s + n;
        }
        System.out.println(n);
        System.out.println(s);


    }

    private static void bai88(){
        //Bài 88: Hãy sử dụng vòng lặp for để xuất tất cả các ký tự từ A đến Z

        for ( char alphabet = 'A'; alphabet < 'Z' ; alphabet++){
            System.out.println(alphabet);
        }
    }

    private static int bai89(int n){
        //Bài 89: Viết chương trình tính tổng các giá trị lẻ nguyên dương nhỏ hơn N
        int s = 0;
        for (int i = 1;i<n; i+=2){
            s = s + i;
        }

        return s;
    }

    private static void bai90(){
        //Bài 91: In tất cả các số nguyên dương lẻ nhỏ hơn 100
        for (int i = 1; i<100; i++){
            if (i%2==1){
                System.out.println(i);
            }
        }

    }

    private static void inSo ( int number){
            System.out.println(number);
        }

    }
