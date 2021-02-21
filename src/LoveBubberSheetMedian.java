import java.util.Arrays;
import java.util.Scanner;

public class LBSheetNo33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfArray = scanner.nextInt();
        int[] arrayOfMedian = new int[lengthOfArray];
        for (int initialI = 0; initialI <= lengthOfArray - 1; initialI++) {
            arrayOfMedian[initialI] = scanner.nextInt();
        }
        System.out.println(methodOfMedian(arrayOfMedian));
    }

    private static int methodOfMedian(int[] arrayOfMedian) {
        int result = 0;
        Arrays.sort(arrayOfMedian);
        if (arrayOfMedian.length % 2 == 0) {
            int median = (arrayOfMedian.length / 2);
            float element = arrayOfMedian[median - 1] + arrayOfMedian[median];
            result = (int) Math.floor(element / 2);

        } else {
            int median = (arrayOfMedian.length / 2);
            float element = arrayOfMedian[median];
            result = (int) Math.floor(element);
        }
        return result;
    }


}
