import java.util.Scanner;

public class CodingInterviewArray7 {
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
        for (int i = 0; i < arrOne.length; i++) {
            for (int j = i; j < arrOne[0].length; j++) {
                int temp = arrOne[i][j];
                arrOne[i][j] = arrOne[j][i];
                arrOne[j][i] = temp;
            }
        }
        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrOne[0].length/2; j++){
                    int temp=arrOne[i][j];
                    arrOne[i][j]=arrOne[i][arrOne.length-j-1];
                    arrOne[i][arrOne.length-j-1]=temp;
            }
        }
        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrOne[0].length; j++)
                System.out.println(arrOne[i][j] + " ");
            System.out.println();
        }
    }
}
