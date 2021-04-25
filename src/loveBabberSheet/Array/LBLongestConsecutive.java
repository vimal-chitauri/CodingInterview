package loveBabberSheet.Array;

import java.util.Arrays;
import java.util.Scanner;

public class LBLongestConsecutive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(longestConsecutiveSubset(arr, n));
    }

    private static int longestConsecutiveSubset(int[] arr, int n) {
        Arrays.sort(arr);
        int count = 1;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && arr[i] + 1 == arr[i + 1]) {
                if (maxCount < count)
                    maxCount = count++;
            } else if (i + 1 < n && arr[i] != arr[i + 1]) {
                count = 1;
            }
        }
        return maxCount + 1;
    }
}
