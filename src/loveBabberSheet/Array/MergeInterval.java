package loveBabberSheet.Array;

import java.io.*;
// Java program to print largest contiguous array sum
import java.util.*;

class MergeInterval {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {0, 2, 6, 8, 9};
        int n = arr1.length;
        int m = arr2.length;
        maxSubArraySum(arr1, arr2, n, m);
    }

    static void maxSubArraySum(int a[], int b[], int n, int m) {
        //  ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i < m && i<n; i++) {
            if (a[n - 1 - 1] > b[i]) {
                int tempA = a[n - 1 - i];
                int tempB = b[i];
                //swapping
                b[i] = tempA;
                a[n - 1 - i] = tempB;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int x : a) {
            System.out.println(x);
        }
        for (int x : b) {
            System.out.println(x);
        }
    }
}

