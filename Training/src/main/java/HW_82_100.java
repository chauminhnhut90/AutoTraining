public class HW_82_100 {
    /**
     * @author tuyennguyen
     * @since 22/05/2019
     * */
    public static void main(String[] args) {
        System.out.println("Bai 82:");
        float k = Bai_82(4,20,1);
        System.out.println(k);
        System.out.println("------------------");

        System.out.println("Bai 83:");
        Bai_83(4,-5);
        System.out.println("------------------");

        System.out.println("Bai 84:");
        Bai_84(8,9);
        System.out.println("------------------");

        System.out.println("Bai 85:");
        Bai_85(4);
        System.out.println("------------------");

        System.out.println("Bai 86:");
        int sum = Bai_86(3);
        inSo(sum);
        System.out.println("------------------");

        System.out.println("Bai 87:");
        Bai_87();
        System.out.println("------------------");

        System.out.println("Bai 88:");
        Bai_88();
        System.out.println("------------------");

        System.out.println("Bai 89:");
        int sumOdd = Bai_89(10);
        inSo(sumOdd);
        System.out.println("------------------");

        System.out.println("Bai 90:");
        Bai_90(100);
        System.out.println("------------------");

        System.out.println("Bai 91:");
        Bai_91();
        System.out.println("------------------");

        System.out.println("Bai 92:");
        int number = Bai_92(6,45);
        inSo(number);
        System.out.println("------------------");

        System.out.println("Bai 93:");
        Bai_93(30);
        System.out.println("------------------");

        System.out.println("Bai 94:");
        Bai_94();
        System.out.println("------------------");

        System.out.println("Bai 95:");
        Bai_95(2,-2,-4);
        System.out.println("------------------");

        System.out.println("Bai 96:");
        float result = Bai_96(3);
        System.out.println(result);
        System.out.println("------------------");

        System.out.println("Bai 97:");
        Bai_97(2,2, 1);
        System.out.println("------------------");

        System.out.println("Bai 98:");
        Bai_98(1,2,3,3,4,5);
        System.out.println("------------------");

        System.out.println("Bai 99:");
        Bai_99(7,2,1);
        System.out.println("------------------");

        System.out.println("Bai 100:");
        Bai_100(2,4,2); // vo nghiem: 232; Nghiem kep: 242
        System.out.println("------------------");

    }

    private static void inSo(int n) {
        System.out.println(n);
    }

    /*Bài 82: Viết chương trình tìm số lớn nhất trong 3 số thực a, b, c */
    private static float Bai_82(float a, float b, float c){
        float max = a;
        if(max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }
        return max;
    }

    /*Bài 83: Viết chương trình nhập 2 số thực, kiểm tra xem chúng có cùng dấu hay không */
    private static void Bai_83(float a, float b){
        if(a*b > 0){
            System.out.println("Cùng dấu");
        }else{
            System.out.println("Trái dấu");
        }
    }

    /*Bài 84: Viết chương trình giải và biện luận phương trình bậc nhất ax + b = 0 */
    private static void Bai_84(float a, float b){
        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình có vô số nghiệm");
            }else{
                System.out.println("Phương trình vô nghiệm");
            }
        }else {
            float x = -b / a;
            System.out.print("Phương trình có nghiệm x = ");
            System.out.println(x);
        }

    }

    /*Bài 85: Nhập vào tháng của 1 năm. Cho biết tháng thuộc quý mấy trong năm */
    private static void Bai_85(int month){
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("First quarter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Second quarter");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Third quarter");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Fourth quarter");
                break;
        }
    }

    /*Bài 86: Tính S(n) = 1^3 + 2^3 + … + N^3 */
    private static int Bai_86(int n){
        int s = 0;
        for(int i = 1; i<=n;i++){
            s+= i*i*i;
        }
        return s;
    }

    /*Bài 87: Tìm số nguyên dương n nhỏ nhất sao cho 1 + 2 + … + n > 10000 */
    private static void Bai_87(){
        int s = 0;
        int n = 0;
        while(s<10000){
            n++;
            s+=n;
        }
        System.out.print("Số n: ");
        System.out.println(n);
    }

    /*Bài 88: Hãy sử dụng vòng lặp for để xuất tất cả các ký tự từ A đến Z */
    private static void Bai_88(){
        for(char i = 'A';i<='Z';i++){
            System.out.println(i);
        }
    }

    /*Bài 89: Viết chương trình tính tổng các giá trị lẻ nguyên dương nhỏ hơn N */
    private static int Bai_89(int n){
        int s = 0;
        for(int i = 1; i<=n; i= i+2){
            s+=i;
        }
        return s;
    }

    /*Bài 90: Viết chương trình tìm số nguyên dương m lớn nhất sao cho 1 + 2 + … + m < N */
    private static void Bai_90(int n){
        int s = 0;
        int m = 0;
        do{
            m+=1;
            s+=m;
        }while (s+m+1<n);
       System.out.print("So nguyên dương m: ");
       System.out.println(m);
    }

    /*Bài 91: In tất cả các số nguyên dương lẻ nhỏ hơn 100 */
    private static void Bai_91(){
        int i = 1;
        while(i < 100){
            System.out.println(i);
            i+=2;
        }
    }

    /*Bài 92: Tìm ước số chung lớn nhất của 2 số nguyên dương */
    private static int Bai_92(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    /*Bài 93: Viết chương trình kiểm tra 1 số có phải là số nguyên tố hay không */
    private static boolean KTSNT(int n){
        if(n%2 == 0){
            return false;
        }
        for(int i = 2; i <=n/2; i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
    private static void Bai_93(int n){
        if(KTSNT(n)== true){
            System.out.println("Là số nguyên tố");
        }else{
            System.out.println("Không là số nguyên tố");
        }

    }

    /*Bài 94: Viết chương trình in ra tất cả các số lẻ nhỏ hơn 100 trừ các số 5, 7, 93 */
    private static void Bai_94(){
        for(int i = 1; i< 100; i+=2){
            if((i==5)|| (i==7)||(i==93)){
                continue;
            }
            System.out.println(i);
        }
    }

    /*Bài 95: Viết chương trình nhập 3 số thực. Hãy thay tất cả các số âm bằng trị tuyệt đối của nó*/
    private static void Bai_95(float a, float b, float c){
        if(a<0)
            a = -a;
        if(b<0)
            b = -b;
        if(c<0)
            c = -c;
        System.out.print("So a: ");
        System.out.println(a);
        System.out.print("So b: ");
        System.out.println(b);
        System.out.print("So c: ");
        System.out.println(c);
    }


    /*Bài 96: Viết chương trình nhập giá trị x sau tính giá trị của hàm số

    f(x) = 2x^2 + 5x + 9 khi x >= 5, f(x) = -2x^2 + 4x – 9 khi x < 5 */
    private static float Bai_96(float x){
        float result;
        if(x>=5)
            result = 2*x*x+ 5*x+9;
        else
            result = -2*x*x+4*x-9;
        return result;
    }

    /*Bài 97: Viết chương trình nhập 3 cạnh của 1 tam giác, cho biết đó là tam giác gì */
    private static void Bai_97(int a, int b, int c){
        if(a+b <= c || a+c <= b || b+c <= a){
            System.out.println("Không là tam giác");
        }else {
            if((a == b) && (b == c)){
                System.out.println("Đây là tam giác đều");
            }else{
                if(a*a + b *b  == c* c || a*c + c*c == b*b || b*b + c*c == a*c){
                    System.out.println("Đây là tam giác vuông");
                }else {
                    if (a == b || a == c || b == c){
                        System.out.println("Đây là tam giác cân");
                    }else {
                        System.out.println("Đây là tam giác thường");
                    }
                }
            }
        }
    }

    /*Bài 98: Lập chương trình giải hệ: ax + by = c

    Dx + ey = f. Các hệ số nhập từ bàn phím */
    private static int Bai_98(int a, int b, int c, int d, int e, int f){
        int D = a*e - d*b;
        int Dx = c*e -f*b;
        int Dy = a*f -d*c;
        int x;
        int y;
        if(D!=0){
            x = Dx/D;
            y = Dy/D;
            System.out.println("Hệ phương trình có một nghiệm duy nhất");
            System.out.print("X = ");
            System.out.println(x);
            System.out.print("Y = ");
            System.out.println(y);
        }else {
            if(Dx!=0 || Dy!=0){
                System.out.println("Hệ phương trình vô nghiệm");

            }else if( Dx == 0 && Dy == 0){
                System.out.println("Hệ phương trình có vô số nghiệm");

            }
        }
        return 0;
    }

    /*Bài 99: Viết chương trình nhập vào 3 số thực.
    Hãy in 3 số ấy ra màn hình theo thứ tự tang dần mà chỉ dùng tối đa 1 biến phụ
     */
    private static float Bai_99(float a, float b, float c){
        float temp;
        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }
        if( a> c){
            temp = a;
            a = c;
            c = temp;
        }
        if(b > c){
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println("Số tăng dần: ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        return 0;
    }

    /*Bài 100: Viết chương trình giải phương trình bậc 2  a*x*x + b*x + c = 0*/
    private static void Bai_100(double a, double b, double c){
        double x1;
        double x2;
        double delta = b*b - 4*a*c;
        if(delta < 0){
            x1 = x2 = 0;
            System.out.println("Phương trình vô nghiệm");
        }else if(delta == 0){
            x1 = x2 = -b/(2*a);
            System.out.print("Phương trình có nghiệm kép: X1 = X2 = ");
            System.out.println(x1);
        }else if(delta > 0){
            delta = Math.sqrt(delta);
            x1 = (-b + delta)/(2*a);
            x2 = (-b - delta)/(2*a);
            System.out.println("Phương trình có hai nghiệm: ");
            System.out.print("X1 = ");
            System.out.println(x1);
            System.out.print("X2 = ");
            System.out.println(x2);
        }

    }



}
