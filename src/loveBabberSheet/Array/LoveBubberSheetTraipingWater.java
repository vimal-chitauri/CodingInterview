package loveBabberSheet.Array;

import java.util.Arrays;
import java.util.Scanner;

public class LoveBubberSheetTraipingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int arr[] = new int[no];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(methodForTraipingWater(arr));

    }

    private static int methodForTraipingWater(int[] arr) {
        int temp = 0;
        int[] arrayRightMost = new int[arr.length];
        int[] arrayLeftMost = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (temp < arr[i])
                arrayRightMost[i] = temp = arr[i];
            arrayRightMost[i] = temp;
        }
        temp = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            if (temp < arr[i])
                arrayLeftMost[i] = temp = arr[i];
            arrayLeftMost[i] = temp;
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            int value = Math.abs(Math.min(arrayLeftMost[i], arrayRightMost[i]) - arr[i]);
            sum=sum+value;
        }
        return sum;
    }



}
