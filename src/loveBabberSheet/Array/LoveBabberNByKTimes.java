package loveBabberSheet.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class LoveBabberNByKTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> hashMap = nByKTimes(arr, n);
        int size = n / k;
        for (Integer integer : hashMap.keySet()) {
            if (hashMap.get(integer) > size) {
                arrayList.add(integer);
            }
        }
        System.out.println(arrayList);

    }

    private static HashMap<Integer, Integer> nByKTimes(int[] arr, int n) {

        int count = 1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Arrays.sort(arr);
            if (i + 1 < n && arr[i] == arr[i + 1]) {
                count++;
                hashMap.put(arr[i], count);
            } else {
                count = 1;
            }
            // count = 0;
        }
        return hashMap;
    }
}
