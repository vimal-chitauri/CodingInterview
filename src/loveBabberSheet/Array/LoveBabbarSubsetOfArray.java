package loveBabberSheet.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LoveBabbarSubsetOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
     //   while (testcase-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] array1 = new int[x];
            int[] array2 = new int[y];
            for (int i = 0; i < x; i++) {
                array1[i] = scanner.nextInt();
            }
            for (int j = 0; j < y; j++) {
                array2[j] = scanner.nextInt();
            }

            System.out.println(methodForSubsetArray(array1, array2));
    //    }
    }

    public static boolean methodForSubsetArray(int[] array1, int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    break;
                }
                if (j == array1.length-1) {
                    return false;
                }
            }
        }
        return true;
    }
}
