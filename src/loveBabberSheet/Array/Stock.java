package loveBabberSheet.Array;

import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(subArrayExists(array));
    }

    private static long subArrayExists(int[] array) {
        long tempStockMaxDiff = 0;

        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] > array[k] && i < k) {
                    tempStockMaxDiff++;
                }
            }
        }
        return tempStockMaxDiff;
    }
}
