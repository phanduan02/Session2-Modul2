import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" Enter a size : ");
            size = scanner.nextInt();
            if ( size > 20){
                System.out.println( " Do not exceed 20 ");
            }
        } while ( size > 20);


        array = new int[size];
        int i = 0;
        while ( i < array.length){
            System.out.println(" Enter elements " + ( i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println(" Property list : ");
        for ( int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "/t");
        }
        int Max = array[0];
        int index = 1;
        for ( int j = 0; j < array.length; j++){
            if ( array[j] > Max){
                Max = array[j];
                index = j + 1;
            }
        }
        System.out.println(" The largest property value  in the list is " + Max + " at position " + index);

    }
}
