package loveBabberSheet.Array;

import java.util.Arrays;
import java.util.Scanner;

public class vikas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();
        int noOfTestRotation = scanner.nextInt();
        int[] arr = new int[noOfTestCases];
        for (int i = 0; i < noOfTestCases; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] array1=arrayLeftRotation(arr, noOfTestRotation, noOfTestCases);
        System.out.println("args = " + array1);


    }

   /* private static void method(int[] arr, int noOfTestRotation, int noOfTestCases) {
        if (arr.length <= noOfTestRotation) {
            while (arr.length <= noOfTestRotation) {
                noOfTestRotation = noOfTestRotation - arr.length;
            }
        }
        int[] arrfirst = new int[noOfTestRotation];
//        int[] arrlast = new int[arr.length - noOfTestRotation];
        for (int i = arr.length; i < 0; i--) {
            if (i < noOfTestRotation) {
                arrfirst[i] = arr[i];
            } else {
                arrfirst[i]
            }
        }
        System.out.println("arrlast = " + arrlast);
        System.out.println("arrfirst = " + arrfirst);


    }*/
    public static int[] arrayLeftRotation(int[] a, int k, int n) {
        if (k >= n) {
            k = k % n;
        }

        if (k == 0) return a;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            if (i + k < n) {
                temp[i] = a[i + k];
            } else {
                temp[i] = a[(i + k) - n];
            }
        }

        return temp;
    }
}
