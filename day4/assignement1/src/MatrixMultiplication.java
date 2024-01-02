//Java Program for Matrix Multiplication
public class MatrixMultiplication {
    public int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int rowsfirstMatrix = firstMatrix.length;
        int colsfirstMatrix = firstMatrix[0].length;
        int colssecondMatrix = secondMatrix[0].length;

        int[][] result = null;
        if (rowsfirstMatrix == colssecondMatrix) {
            result = new int[rowsfirstMatrix][colssecondMatrix];

            for (int i = 0; i < rowsfirstMatrix; i++) {
                for (int j = 0; j < colssecondMatrix; j++) {
                    for (int k = 0; k < colsfirstMatrix; k++) {
                        result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                    }
                }
            }
        } else {
            throw new RuntimeException("Matrix Multiplication Not Possible");
        }
        return result;
    }

    public void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
