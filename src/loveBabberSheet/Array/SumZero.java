package loveBabberSheet.Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }
//        System.out.println(findSum(array,sizeOfArray));
        System.out.println(subArrayExists(array));
    }

   /* private static void findSum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {


            }

        }
    }*/
    static boolean findSum(int arr[],int n)
    {
        boolean condition = false;
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            if (sum == 0) {
                condition = true;
                break;
            }
            for (int j = i + 1; j < n; j++) {
                sum = sum + arr[j];
                if (sum == 0) {
                    condition = true;
                    break;
                }
            }
        }
        return condition;
    }

    static Boolean subArrayExists(int arr[])
    {
        // Creates an empty hashset hs
        Set<Integer> hs = new HashSet<Integer>();

        // Initialize sum of elements
        int sum = 0;

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++)
        {
            // Add current element to sum
            sum += arr[i];

            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash map
            if (arr[i] == 0
                    || sum == 0
                    || hs.contains(sum))
                return true;

            // Add sum to hash set
            hs.add(sum);
        }

        // We reach here only when there is
        // no subarray with 0 sum
        return false;
    }
}
