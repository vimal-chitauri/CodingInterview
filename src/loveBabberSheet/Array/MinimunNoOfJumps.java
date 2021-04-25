package loveBabberSheet.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinimunNoOfJumps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfArray= scanner.nextInt();
        int[] array=new int[noOfArray];
        for (int i = 0; i < noOfArray; i++) {
            array[i]=scanner.nextInt();
        }
        System.out.println(MinimunNoOfJumpsMethod(array,noOfArray));
    }

    private static int MinimunNoOfJumpsMethod(int[] array, int noOfArray) {
        boolean condition=true;
        int finalResult=0;
        int initial=array[0];
        int count=1;
        List<Integer> list=new ArrayList<>();
        list.add(Arrays.stream(array).toArray());
        while (condition){
            if(array[initial]<=array.length){
                int x=list.indexOf(initial);
                finalResult=array[x+initial];
            }
            if(finalResult>= (noOfArray-1-initial)){
                condition=false;
            }
            initial=finalResult;
            count++;
        }
        return count;
    }
}
