public class findMaxInMatrix {
    public static int maxValue(int[][] array) {
        int max = array[0][0];
        for (int row = 0; row < array.length; row++) {
            for (int columm = 0; columm < array[row].length; columm++) {
                if (array[row][columm] > max) {
                    max = array[row][columm];
                }
            }
        }
        return max;
    }

    public static void main(String[][] args) {
        int[][] arr = {
                {234, 235346, 23423},
                {123, 45346, 45654},
        };
        int max = maxValue(arr);
        System.out.println(" Max is " + max);
    }
}
