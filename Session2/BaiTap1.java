//import java.util.Scanner;
//
//public class BaiTap1 {
//    public static void main(String[] args) {
//        int[] array;
//        array = new int[10];
//        array[0] = 1;
//        array[1] = 1;
//        array[2] = 1;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println( " Nhap so can them : ");
//        int X;
//        X =  scanner.nextInt();
//        System.out.println(" Nhap vi tri can them : ");
//        int index;
//        index = scanner.nextInt();
//        if ( index >= array.length - 1 && index <= 1){
//            System.out.println("Khong the them so");
//
//        } else {
//            for ( int i = index; i < array.length - 1 ; i++ ){
//                array[index] = X;
//                array[i + 1] = array [index - 1];
//                System.out.println(" Mang moi la" + array);
//            }
//        }
//
//    }
//}
class ChuNhat {
    public int rong, dai;

    public ChuNhat(int rong, int dai) {
        this.rong = rong;
        this.dai = dai;
    }
}

class MyClass {
    void method(ChuNhat x) {
        x.rong = 5;
        x.dai = 5;
    }

    public static void main(String[] args) {
        MyClass o = new MyClass();
        ChuNhat cn = new ChuNhat(1, 1);
        o.method(cn);
        System.out.printf("x=%d, y=%d", cn.rong, cn.dai);
    }
}