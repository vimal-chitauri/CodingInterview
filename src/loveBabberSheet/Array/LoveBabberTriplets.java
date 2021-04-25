package loveBabberSheet.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class LoveBabberTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int tripletCount = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(methodOfTriplet(array, tripletCount));

    }

    private static boolean methodOfTriplet(int[] A, int tripletCount) {
        int l, r, n = A.length;
        Arrays.sort(A);
        for (int i = 0; i < n - 3; i++) {
            for (int j = 0; j < n - 2; j++) {
                l = i + 1;
                r = n - 1;
                while (l < r) {
                    if (A[i] + A[j] + A[l] + A[r] == tripletCount) {
                        return true;
                    } else if (A[i] + A[j] + A[l] + A[r] < tripletCount)
                        l++;

                    else // A[i] + A[l] + A[r] > sum
                        r--;
                }
            }

        }

        // If we reach here, then no triplet was found
        return false;
    }


}

