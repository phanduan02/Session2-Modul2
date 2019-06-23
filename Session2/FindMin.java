public class FindMin {
    public  static  int minValue( int[] array){
        int min = array[0];
        int index = 0;
        for ( int i = 1; i < array.length; i++){
            if ( array[i] < min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {234324,4,346,357,45,64,5,1,23,5,357,4,854,6};
        int index = minValue(arr);
        System.out.println(" Min is " + arr[index]);
    }
}
