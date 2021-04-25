package loveBabberSheet.Array;

import java.util.Scanner;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int[] arr = new int[no];
        for (int i = 0; i < no; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findSum(arr, no));
    }

    static boolean findSum(int arr[], int n) {
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
}
