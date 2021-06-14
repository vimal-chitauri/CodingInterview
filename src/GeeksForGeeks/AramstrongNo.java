package GeeksForGeeks;
import java.util.Scanner;


public class AramstrongNo {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int no=scanner.nextInt();
        System.out.println(methodForArmStrong(no));
    }

    public static boolean methodForArmStrong(int no){
        char[] charsArm = ("" + no).toCharArray();
       double countNo=0,countArm=0;

        for(int i=0; i<charsArm.length;i++){
            double tempNo=Double.parseDouble(String.valueOf(charsArm[i]));
            countArm=countArm+Math.pow(tempNo,charsArm.length);
            countNo+=charsArm[i];
        }
        if(countArm==countNo)
            return true;
        else
            return false;
    }
}
