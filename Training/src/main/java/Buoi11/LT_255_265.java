package Buoi11;
/**
 * @author tuyennguyen
 * @since 19/05/2019
 * */
@SuppressWarnings("all")
public class LT_255_265 {
    public static void main(String[] agrs){
        int[] array = new int[]{1, 12, 3, 4, 15, 22, 27, 30, 16, 28};

        System.out.println("Bai 255:");
        Bai_255(array);
        System.out.println("------------------");

        System.out.println("Bai 256:");
        Bai_256(array);
        System.out.println("------------------");

    }

    /*Bài 255: Sắp xếp mảng tăng dần */
    private static void Bai_255(int []array){
        for(int i = 0; i< array.length-1; i++){
            for(int j = i+1; j< array.length; j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]= temp;
                }
            }
        }
    }

    /*Bài 256: Sắp xếp mảng giảm dần */
    private static void Bai_256(int []array){
        for(int i = 0; i< array.length-1; i++){
            for(int j = i+1; j< array.length; j++){
                if(array[i]< array[j]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]= temp;
                }
            }
        }
    }

    /*Bài 257: Sắp xếp lẻ tăng dần nhưng giá trị khác giữ nguyên vị trí */


    /*Bài 258: Sắp xếp số nguyên tố tăng dần nhưng giá trị khác giữ nguyên vị trí */

    /*Bài 259: Sắp xếp số hoàn thiện giảm dần nhưng giá trị khác giữ nguyên vị trí */

    /*Bài 260: Cho 2 mảng a, b. Hãy cho biết mảng b có phải là hoán vị của mảng a không */

    /*Bài 261: Sắp xếp số dương tăng dần, các số âm giữ nguyên vị trí */

    /*Bài 262: Sắp xếp chẵn, lẻ tăng dần nhưng vị trí tương đối giữa các số không thay đổi */

    /*Bài 263: Sắp xếp số dương tăng dần, âm giảm dần. Vị trí tương đối không thay đổi */

    /*Bài 264: Trộn 2 mảng đã tăng thành 1 mảng được sắp xếp tăng */
    /*Bài 265: Cho 2 mảng tăng. Hãy trộn thành 1 mảng giảm dần*/

}
