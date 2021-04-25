package loveBabberSheet.Array;

import java.util.Arrays;
import java.util.Scanner;

public class LBProductSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(productSubArray(arr, n));

    }


    private static long productSubArray(int[] arr, int n) {
        long finalProductSubArray = arr[0];
        for (int i = 0; i < n; i++) {
            long tempProductSubArray = arr[i];
            for (int j = i+1; j < n; j++) {
                finalProductSubArray=Math.max(tempProductSubArray,finalProductSubArray);
                    tempProductSubArray=tempProductSubArray*arr[j];
            }
            finalProductSubArray= Math.max(finalProductSubArray,tempProductSubArray);
        }
        return finalProductSubArray;
    }
}
