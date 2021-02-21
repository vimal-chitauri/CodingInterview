import java.util.Scanner;

public class CodingInterviewArray6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
       // char[] array = str.toCharArray();
        int count = 0;
        String finalString = "";
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i+1>=str.length()||str.charAt(i) != str.charAt(i + 1)) {
                finalString = methodForStringAppend(finalString, str.charAt(i), count);
                count = 0;
            }
        }
        System.out.println(finalString);

    }

    private static String methodForStringAppend(String finalString, char c, int count) {
        return finalString + c + "" + count;
    }
}
