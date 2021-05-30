package loveBabberSheet.Matrix;

import java.util.Scanner;

public class MaxNoOfOnes {
    public static void main(String[] args) {
        int m=2,n=6;
        int[][] arr=new int[m][n];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println(rowWithMax1s(arr,m,n));
    }
    public static int rowWithMax1s(int arr[][], int n, int m) {
        int count=0;
        int finalCount=0;
        int finalrow=0;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    count++;
                    if(count>=finalCount){
                        finalCount=count;
                        finalrow=i;
                    }
                }
            }
        }
        return finalrow;
    }
}
