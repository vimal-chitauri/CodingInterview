package loveBabberSheet.Javalearning;// Java program to print a given matrix in spiral form
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class JavaLearning {

    // Function print matrix in spiral form
    static int spiralPrint(int r, int c, int matrix[][])
    {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr.add(matrix[i][j]);
            }
        }
        Collections.sort(arr);
        int size=arr.size()+1;

        int median =arr.get(size%2);
        return median;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int r = 3;
        int c= 3;
        int a[][] = { { 1, 2, 3 },
                { 7, 8, 9 },
                { 13, 14, 15 } };

        // Function Call
        spiralPrint(r,c,a);
    }
}

// Contributed by Pramod Kumar
