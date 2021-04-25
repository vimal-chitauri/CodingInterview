package loveBabberSheet.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CommonElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize1 = scanner.nextInt();
        int arraySize2 = scanner.nextInt();
        int arraySize3 = scanner.nextInt();
        int[] array1 = new int[arraySize1];
        int[] array2 = new int[arraySize2];
        int[] array3 = new int[arraySize3];
        for (int a = 0; a < arraySize1; a++) {
            array1[a] = scanner.nextInt();
        }
        for (int a = 0; a < arraySize2; a++) {
            array2[a] = scanner.nextInt();
        }
        for (int a = 0; a < arraySize3; a++) {
            array3[a] = scanner.nextInt();
        }
        methodForAlternativeNo(array1, array2, array3, arraySize1, arraySize2, arraySize3);
    }

    private static void methodForAlternativeNo(int[] array1, int[] array2, int[] array3,
                                               int arraySize1, int arraySize2, int arraySize3) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Integer[] newArray2 = Arrays.stream( array2 ).boxed().toArray( Integer[]::new );
        Integer[] newArray3 = Arrays.stream( array3 ).boxed().toArray( Integer[]::new );
        List<Integer> arrayList2 = Arrays.asList(newArray2);
        List<Integer> arrayList3 = Arrays.asList(newArray3);
        for (int i = 0; i < arraySize1; i++) {

            if (arrayList2.contains(array1[i]) && arrayList3.contains(array1[i]) &&
                    !arrayList.contains(array1[i])) {
                arrayList.add(array1[i]);
            }
        }

        Arrays.stream(array2).boxed().toArray(Integer[]::new);
        Arrays.stream(array2).boxed().toArray(Integer[]::new);
    }
}
