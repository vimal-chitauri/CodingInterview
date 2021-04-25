package codingInterview1_9;

import java.util.Scanner;

public class codingInterviewArray8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[][] arrOne = new int[arraySize][arraySize];

        for (int initialI = 0; initialI < arrOne.length; initialI++) {
            for (int initialJ = 0; initialJ < arrOne[0].length; initialJ++) {
                arrOne[initialI][initialJ] = scanner.nextInt();
            }
        }
        methodForZerSet(arrOne);
    }

    private static void methodForZerSet(int[][] arrOne) {
        boolean[] row = new boolean[arrOne.length];
        boolean[] column = new boolean[arrOne[0].length];
        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrOne[0].length; j++) {
                if (arrOne[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        for (int i = 0; i < row.length; i++) {
            if (row[i]) nullifyRow(arrOne, i);
        }
        for (int i = 0; i < column.length; i++) {
            if (column[i]) nullifyColumn(arrOne, i);
        }
        //printing array
        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrOne[0].length; j++)
                System.out.println(arrOne[i][j] + " ");
            System.out.println();
        }

    }

    private static void nullifyRow(int[][] arrOne, int row) {
        for (int j = 0; j < arrOne.length; j++) {
            arrOne[row][j] = 0;

        }
    }

    private static void nullifyColumn(int[][] arrOne, int column) {
        for (int j = 0; j < arrOne.length; j++) {
            arrOne[j][column] = 0;

        }
    }

}
