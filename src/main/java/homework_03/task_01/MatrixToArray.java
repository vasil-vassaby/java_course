package homework_03.task_01;

public class MatrixToArray {
    public static int[] matrixToArray(int[][] matrix) {
        int[] array = new int[matrix.length * 3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                array[i * matrix.length + j] = matrix[i][j];
            }
        }
        return array;
    }
}