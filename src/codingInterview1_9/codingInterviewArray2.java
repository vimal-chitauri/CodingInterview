package codingInterview1_9;

import java.util.Arrays;
import java.util.Scanner;

public class codingInterviewArray2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String originalString=scanner.next();
        String permutationsString=scanner.next();
        System.out.println(methodPermutationCheck(originalString,permutationsString));

    }

    private static boolean methodPermutationCheck(String originalString, String permutativaString) {
        if(originalString.length()!=permutativaString.length())return false;
        return sort(originalString).equals(sort(permutativaString));
    }

    private static String sort(String sortString) {
        char[] newcharArray=sortString.toCharArray();
        Arrays.sort(newcharArray);
        return new String(newcharArray);
    }
}
