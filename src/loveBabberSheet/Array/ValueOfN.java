package loveBabberSheet.Array;

import java.util.Scanner;

public class ValueOfN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        method(x);


    }
    static void method(int n){
        int p=0;
        for (int i = 0; i <= n; i++) {
            for (int j = n/2; j <= n; j++) {
                for (int k = 1; k <= n; k=k*2) {
                    p++;
                }
            }
        }
        System.out.println(p);
    }
}
