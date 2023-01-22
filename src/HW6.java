public class HW6 {
    public static void arr() {
        int[][] array = new int[2][2];
        int[][] array1 = new int[2][2];
        array[0][0] = 2;
        array[0][1] = 4;
        array[1][0] = 6;
        array[1][1] = 8;
        array1[0][0] = 8;
        array1[0][1] = 6;
        array1[1][0] = 4;
        array1[1][1] = 2;
        int[][] result = new int[2][2];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = array[i][j] * array1[i][j];
                System.out.println(result[i][j]);
            }
        }

    }
    public static void main(String[] args) {
       arr();
    }
}
