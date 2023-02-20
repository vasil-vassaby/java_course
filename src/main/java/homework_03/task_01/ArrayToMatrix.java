package homework_03.task_01;

public class ArrayToMatrix {
    public static int[][] arrayToMatrix(int[] array) {
        double a = Math.ceil(Math.sqrt(array.length));
        int matrix[][] = new int[(int) a][(int) a];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = array[i * matrix.length + j];
            }
        }
        return matrix;
    }
}