import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution implements Interface{

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

    return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();
       // int noOfTestRotation = scanner.nextInt();
        int[] arr = new int[noOfTestCases];
        for (int i = 0; i < noOfTestCases; i++) {
            arr[i] = scanner.nextInt();
        }
        int array1=minimumSwaps(arr);
        System.out.println("args = " + array1);


    }

    @Override
    public void getDetail() {
        System.out.println("Interface is called");
    }
}
