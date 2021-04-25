package codingInterview1_9;

import java.util.Scanner;

public class CodingInterviewArray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(methodUnique(string));

    }

    private static boolean methodUnique(String string) {
        if (string.length() > 128) return false;
        boolean charset[] = new boolean[128];
        for (int i = 0; i < string.length(); i++) {
            int place = string.charAt(i);
            if (charset[place]) return false;
            charset[place] = true;
        }
        return true;
    }
}

