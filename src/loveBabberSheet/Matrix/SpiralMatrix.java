package loveBabberSheet.Matrix;


public class SpiralMatrix {
    public static void main(String[] args)
    {
        int R = 3;
        int C = 6;
        int a[][] = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 } };

        // Function Call
        spiralPrint(R, C, a);
    }
    public static void spiralPrint(int r, int c, int[][] a){
        int lastRow=r-1;
        int lastColumn=c-1;
        int k=0,l=0;

        while(k<lastRow&& l<lastColumn){
            for (int i = k; i < lastColumn; i++) {
                System.out.println(a[k][i]+" ");
            }
            k++;
            for (int i = l; i < lastRow; i++) {
                System.out.println(a[i][lastColumn]+" ");
            }
            l++;
            if(k<lastRow){
                for (int i = lastColumn; i >=lastRow ; i--) {
                    System.out.println(a[lastRow][i]+" ");
                }
                lastColumn--;
            }
            if(l<lastColumn){
                for (int i = lastRow; i >=lastColumn ; i--) {
                    System.out.println(a[i][lastColumn]+" ");
                }
                lastRow--;
            }

        }


    }
}
