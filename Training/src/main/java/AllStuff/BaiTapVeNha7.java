package AllStuff;

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

        System.out.println("Bai90: Viết chương trình tìm số nguyên dương m lớn nhất sao cho 1 + 2 + … + m < N");
        bai90(10);

        System.out.println("Bài 91: In tất cả các số nguyên dương lẻ nhỏ hơn 100");
        bai91();

        System.out.println("Bài 92: ước số chung lớn nhất của 2 số nguyên dương");
        int bai92 = bai92(4, 5);
        inSo(bai92);

        System.out.println("Bai 93: kiểm tra 1 số có phải là số nguyên tố hay không ");
        bai93(6);

        System.out.println("Bai 94: in ra tất cả các số lẻ nhỏ hơn 100 trừ các số 5, 7, 93");
        bai94();

        System.out.println("bai95: nhập 3 số thực. Hãy thay tất cả các số âm bằng trị tuyệt đối của nó");
        bai95(-2, 3, -5);

        System.out.println("Bai 96: nhập giá trị x sau tính giá trị của hàm số");
        int bai96 = bai96(2);
        inSo(bai96);

        System.out.println("Bai 97: nhập 3 cạnh của 1 tam giác, cho biết đó là tam giác gì");
        bai97(2, 2, 2);

        System.out.println("Bai 99: nhập vào 3 số thực, Hãy in 3 số ấy ra màn hình theo thứ tự tang dần");
        bai99(5, 4, 10);

        System.out.println("Bai 100: giải phương trình bậc 2");
        bai100(2, -7, 3);


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

        if (t >= 1 && t <= 12) {
            if (t == 1 || t == 2 || t == 3)
                System.out.println("Thang thuoc quy 1");

            if (t == 4 || t == 5 || t == 6)
                System.out.println("Thang thuoc quy 2");

            if (t == 7 || t == 8 || t == 9)
                System.out.println("Thang thuoc quy 3");

            if (t == 10 || t == 11 || t == 12)
                System.out.println("Thang thuoc quy 4");

        } else {
            System.out.println("Thang invalid");
        }


    }

    private static int bai86(int n) {
        //Bài 86: Tính S(n) = 1^3 + 2^3 + … + N^3
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s += i * i * i;
        }
        return s;
    }

    private static void bai87() {
        //Bài 87: Tìm số nguyên dương n nhỏ nhất sao cho 1 + 2 + … + n > 10000
        int s = 0;
        int n;
        for (n = 0; s < 10000; n++) {
            s = s + n;
        }
        System.out.println(n);
        System.out.println(s);


    }

    private static void bai88() {
        //Bài 88: Hãy sử dụng vòng lặp for để xuất tất cả các ký tự từ A đến Z

        for (char alphabet = 'A'; alphabet < 'Z'; alphabet++) {
            System.out.println(alphabet);
        }
    }

    private static int bai89(int n) {
        //Bài 89: Viết chương trình tính tổng các giá trị lẻ nguyên dương nhỏ hơn N
        int s = 0;
        for (int i = 1; i < n; i += 2) {
            s = s + i;
        }

        return s;
    }

    private static void bai90(int n) {
        //Bài 90: Viết chương trình tìm số nguyên dương m lớn nhất sao cho 1 + 2 + … + m < N
        int m;
        int s = 0;
        for (m = 0; s+m+1 <= n; m+=1) {
            s +=m;

            }
        System.out.println(m);
        }

    private static void bai91() {
        //Bài 91: In tất cả các số nguyên dương lẻ nhỏ hơn 100

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    private static int bai92(int a, int b) {
        //Bài 92: Tìm ước số chung lớn nhất của 2 số nguyên dương
        int i;
        if (a > b) {
            i = a - b;
        } else {
            i = b - a;
        }
        return i;
    }

    private static void bai93(int a) {
        //Bài 93: Viết chương trình kiểm tra 1 số có phải là số nguyên tố hay không
        //Note: Số nguyên tố là số chỉ chia hết cho 1 và chính nó
        if (a < 2) {
            System.out.println(a + " Không phải là số nguyên tố!");
        } else if (a == 2) {
            System.out.println(a + " là số nguyên tố!");
        } else if (a > 2 && a % 2 == 0) {
            System.out.println(a + " Khong la so nguyen to");
        } else {
            System.out.println(a + " la so nguyen to");
        }


    }

    private static void bai94() {
        //Bài 94: Viết chương trình in ra tất cả các số lẻ nhỏ hơn 100 trừ các số 5, 7, 93
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1 && i != 5 && i != 7 && i != 93) {
                System.out.println(i);
            }
        }
    }

    private static void bai95(int a, int b, int c) {
        //Bài 95: Viết chương trình nhập 3 số thực. Hãy thay tất cả các số âm bằng trị tuyệt đối của nó

        if (a < 0)
            a = -a;
        if (b < 0)
            b = -b;
        if (c < 0)
            c = -c;

        System.out.println("Tri tuyet doi cua a, b, c la " + a + " " + b + " " + c);

    }

    private static int bai96(int x) {
        //Bài 96: Viết chương trình nhập giá trị x sau tính giá trị của hàm số
        //f(x) = 2x^2 + 5x + 9 khi x >= 5,
        // f(x) = -2x^2 + 4x – 9 khi x < 5
        int f = 0;

        if (x >= 5) {
            f = 2 * x * x + 5 * x + 9;
        } else {
            f = -2 * x * x + 4 * x - 9;
        }

        return f;
    }

    private static void bai97(int a, int b, int c) {
        //Bài 97: Viết chương trình nhập 3 cạnh của 1 tam giác, cho biết đó là tam giác gì
        if (a == b && b == c) {
            System.out.println("Day la tam giac deu");
        }else if (a == b || a == c || b == c) {
            System.out.println("Day la tam giac can");
        }else if (a + b == c || a + c == b || b + c == a) {
            System.out.println("Day la tam giac vuong");
        } else {
            System.out.println("Tam giac thuong");
        }

    }

    private static void bai99(int a, int b, int c){
        //Bài 99: Viết chương trình nhập vào 3 số thực.
        // Hãy in 3 số ấy ra màn hình theo thứ tự tang dần mà chỉ dùng tối đa 1 biến phụ
        int temp;
        if (a>b)
        {
            temp = a; a=b; b = temp;
        }
        if (a>c)
        {
            temp = a; a = c; c = temp;
        }
        if (b>c)
        {
            temp = b; b = c; c = temp;
        }

        System.out.println("Day so tang dan la: "+ a +" " + b + " " + c);
    }

    private static  void bai100(int a, int b, int c){
        //Bài 100: Viết chương trình giải phương trình bậc 2
        //ax2 + bx + c = 0
        double x = 0;
        double denta = b*b - 4*a*c;
        if (a==0)
        {
            if (b==0){
                if (c==0){
                    System.out.println("Phuong trinh co vo so nghiem");
                }else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }else {
                x = -c/b;
                System.out.println(x);
            }

        }else {

            if (denta < 0 ){
                System.out.println("Phuong trinh vo nghiem");
            } else if (denta == 0){
                x = -b/(2*a);
                System.out.println("Phuong trinh co nghiem kep x1 = x2: " + x);
            } else {
                Double x1 = (-b + Math.sqrt(denta))/(2*a);
                Double x2 = (-b - Math.sqrt(denta))/(2*a);

                System.out.println("Phuong trinh co nghiem x1 la: "+ x1 +  ", Phuong trinh co nghiep x2 la: " + x2);

            }
        }
    }

    private static void inSo(int number) {
        System.out.println(number);
    }

}
