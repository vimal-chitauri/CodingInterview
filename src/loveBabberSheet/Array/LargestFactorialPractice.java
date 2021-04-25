package loveBabberSheet.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestFactorialPractice {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        int no = 10;
        int[] res = new int[500];
        int res_size = 1;
        res[0] = 1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 2; i <= no; i++) {
            res_size = methodForResSize(i, res_size, res);
        }

        for (int i = res_size-1; i >= 0; i--) {
            arrayList.add(res[i]);
        }

        System.out.println(arrayList);
    }

    private static int methodForResSize(int i, int res_size, int[] res) {
        int carry = 0;
        for (int j = 0; j < res_size; j++) {
            int prod = res[j] * i + carry;
            res[j] = prod % 10;
            carry = prod / 10;
        }
        while (carry != 0) {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }


}
