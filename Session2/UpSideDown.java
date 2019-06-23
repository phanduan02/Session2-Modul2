import java.util.Scanner;

public class UpSideDown {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println( " Enter size : ");
            size = scanner.nextInt();
            if ( size > 20){
                System.out.println( " Size do not exceed ");
            }
        } while ( size > 20);

        array = new int[size];
        int i = 0;
        while ( i < array.length){
            System.out.println( " Enter elements : " + "\t");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for ( int j = 0; j < array.length; j++){
            System.out.println(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
