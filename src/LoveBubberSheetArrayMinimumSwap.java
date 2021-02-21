import java.util.Scanner;

public class LBSheetArrayMinimumSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int maxNo = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        methodForMinimumSwapCount(array,maxNo);
    }

    private static void methodForMinimumSwapCount(int[] array,int k) {
        int minimumNo;
        int noOfSwap=0;
        int minimumNoIndex;
        for (int i = 0; i < array.length; i++) {
            minimumNo=array[i];
            minimumNoIndex=i;
            if(array[i]>k){
                for (int j = i+1; j <array.length ; j++) {
                    if(array[j]<minimumNo){
                        minimumNo=array[j];
                        minimumNoIndex=j;
                    }
                }
                int temp=array[i];
                array[i]=minimumNo;
                array[minimumNoIndex]=temp;
                if(array[i]<=k) {
                    noOfSwap++;
                }
            }
        }
        System.out.println(noOfSwap);
    }
}
