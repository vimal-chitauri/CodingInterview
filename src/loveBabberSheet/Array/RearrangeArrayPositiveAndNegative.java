package loveBabberSheet.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class RearrangeArrayPositiveAndNegative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int a = 0; a < arraySize; a++) {
            array[a] = scanner.nextInt();
        }
        methodForAlternativeNo(array);
    }

    private static void methodForAlternativeNo(int[] array) {
        ArrayList<Integer> arrayListPositive = new ArrayList<>();
        ArrayList<Integer> arrayListNegative = new ArrayList<>();
        int[] arrayResult = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) arrayListNegative.add(array[i]);
            if (array[i] > 0) arrayListPositive.add(array[i]);
        }

        for (int i = 0; i < array.length + 1; i++) {
            if (arrayListNegative != null && i % 2 == 0) {
                arrayResult[i] = arrayListNegative.get(i);
                arrayListNegative.remove(i);
            }

            if (arrayListPositive != null && i % 2 != 0) {
                arrayResult[i] = arrayListPositive.get(i);
                arrayListPositive.remove(i);
            }

            if (arrayListPositive == null)
                arrayResult[i] = arrayListNegative.get(i);
            else if (arrayListNegative == null)
                arrayResult[i] = arrayListPositive.get(i);


        }
    }
}
