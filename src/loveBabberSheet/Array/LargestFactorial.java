package loveBabberSheet.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LargestFactorial {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=factorial(100);

        for(Integer integer:arrayList)
        System.out.print(integer);
    }

    static ArrayList<Integer> factorial(int i){
        int[] res = new int[500];
        res[0] = 1;
        int res_size = 1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int j = 2; j <= i; j++)
            res_size = methodForResultArray(j, res, res_size);

        for (int j = res_size - 1; j >= 0; j--)
            arrayList.add(res[j]);

        return arrayList;
    }
    private static int methodForResultArray(int j, int[] res, int res_size) {
        int carry = 0;

        for (int i = 0; i < res_size; i++) {
            int prod = res[i] * j + carry;
            res[i] = prod % 10;
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
