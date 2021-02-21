import java.util.Arrays;
import java.util.Scanner;

public class LBSheetNo34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] arrayOne = new int[sizeArray];
        int[] arrayTwo = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            arrayOne[i] = scanner.nextInt();
        }
        for (int i = 0; i < sizeArray; i++) {
            arrayTwo[i] = scanner.nextInt();
        }
        System.out.println(methodMedian(arrayOne, arrayTwo));

    }

    private static float methodMedian(int[] arrayOne, int[] arrayTwo) {
        int pos = 0;
        int[] arrayNew = new int[arrayOne.length + arrayOne.length];
        for (int i = 0; i < arrayOne.length; i++) {
            arrayNew[pos] = arrayOne[i];
            pos++;
        }
        for (int i = 0; i < arrayTwo.length; i++) {
            arrayNew[pos] = arrayTwo[i];
            pos++;
        }
        float medidan;
        Arrays.sort(arrayNew);
        if (arrayNew.length % 2 == 0) {
            medidan = Math.abs(arrayNew[arrayNew.length / 2-1] + arrayNew[arrayNew.length/2] / 2);
        } else {
            medidan = arrayNew[arrayNew.length / 2];
        }
        return medidan;
    }
}
