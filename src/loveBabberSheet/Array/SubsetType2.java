package loveBabberSheet.Array;

import static java.util.Arrays.binarySearch;

public class SubsetType2 {
    public static void main(String args[]) {
        long arr1[] = {2, 5, 10, 20, 4, 3, 30};
        long arr2[] = {30, 5, 10, 39};

        long m = arr1.length - 1;
        long n = arr2.length - 1;

        if (isSubset(arr1, arr2, m, n))
            System.out.print("arr2[] is subset of arr1[] ");
        else
            System.out.print(
                    "arr2[] is not a subset of arr1[]");
    }

    private static boolean isSubset(long[] arr1, long[] arr2, long sizeOfArr1, long sizeOfArr2) {

        sortArray(arr1, 0, sizeOfArr1);
        for (int i = 0; i < sizeOfArr2; i++) {
            if (binarySearchOfArray(arr1, 0, sizeOfArr1, arr2[i]) == -1) {
                return false;
            }
        }
        return true;

    }

    private static long binarySearchOfArray(long[] arr1, long low, long high, long element) {
        if (low <= high) {
            int mid = (int) ((high + low) / 2);
            if (arr1[mid] == 0 || arr1[mid - 1] < element && arr1[mid] == element) {
                return mid;
            } else if (arr1[mid] > element) {
                return binarySearchOfArray(arr1, low, mid - 1, element);
            } else if (arr1[mid] < element) {
                return binarySearchOfArray(arr1, mid + 1, high, element);
            }
        }
        return -1;
    }


    private static void sortArray(long[] arr1, long first, long last) {
        if (first < last) {
            long pi = partitionArray(arr1, first, last);
            sortArray(arr1, first, pi - 1);
            sortArray(arr1, pi + 1, last);
        }
    }

    private static long partitionArray(long[] arr1, long first, long last) {
        int pivot = (int) arr1[(int) last];
        int i = (int) (first - 1);
        for (int j = (int) first; j < last; j++) {
            if (arr1[j] <= pivot) {
                i++;
                long temp = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = temp;
            }
        }
        int temp = (int) arr1[i + 1];
        arr1[i + 1] = arr1[(int) last];
        arr1[(int) last] = temp;
        return i + 1;
    }


}
