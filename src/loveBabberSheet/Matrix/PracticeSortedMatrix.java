package loveBabberSheet.Matrix;

import java.util.Arrays;

public class PracticeSortedMatrix {
    public static void main(String[] args) {
        int[][] mat = {{5, 4, 7},
                {1, 3, 8},
                {2, 9, 6}};
        int n = 3;

        System.out.println("Original Matrix:");
        printMat(mat, n);

        int[][] sortedMatrix = sortMat(mat, n);

        System.out.println("Matrix After Sorting:");
        printMat(sortedMatrix, n);

    }

    static void printMat(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }

    private static int[][] sortMat(int[][] mat, int n) {
        int[] tempArr = new int[n * n];
        int[][] newMatrix = new int[n][n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                tempArr[k++] = mat[i][j];
        }
        Arrays.sort(tempArr);
        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                newMatrix[i][j] = tempArr[k++];
        }
        return newMatrix;
    }
}
