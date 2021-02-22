import java.util.Scanner;

public class LoveBubberSheetThreeWayPartiotioning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] arrayOne = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            arrayOne[i] = scanner.nextInt();
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        methodForPartitioning(arrayOne, a, b);
    }

    private static void methodForPartitioning(int[] arr, int lowVal, int highVal) {

        int n = arr.length;
        int start = 0, end = n - 1;
        for (int i = 0; i <= end; ) {
            if (arr[i] < lowVal) {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
                i++;

            } else if (arr[i] > highVal) {

                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;

            } else
                i++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }
}

