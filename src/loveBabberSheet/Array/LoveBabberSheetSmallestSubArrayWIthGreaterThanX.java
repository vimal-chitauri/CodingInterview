package loveBabberSheet.Array;

import java.util.Arrays;
import java.util.Scanner;

public class LoveBabberSheetSmallestSubArrayWIthGreaterThanX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] arrayOne = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            arrayOne[i] = scanner.nextInt();
        }
        int maxNo = scanner.nextInt();
        methodForPartitioning(arrayOne, maxNo);
    }

    private static void methodForPartitioning(int[] arrayOne, int maxNo) {
        int originalCount = arrayOne.length;
        for (int j = 0; j < arrayOne.length; j++) {
            int tempMinimumCount = 0;
            int sum = 0;
            for (int i = j; i < arrayOne.length; i++) {
                sum = sum + arrayOne[i];
                tempMinimumCount++;
                if (sum > maxNo) {
                    if (originalCount > tempMinimumCount) {
                        originalCount = tempMinimumCount;
                    }
                    break;
                }
            }
        }
        System.out.println(originalCount);
    }
}
