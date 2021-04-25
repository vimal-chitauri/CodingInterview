package codingInterview1_9;

import java.util.Scanner;

public class CodingInterviewArray5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        System.out.println(methodForOneAway(s1, s2));
    }

    private static boolean methodForOneAway(String s1, String s2) {
        if (s1.length() == s2.length())
            return methodForReplacement(s1, s2);
        else if (s1.length() + 1 == s2.length())
            return methodForRemove(s1, s2);
        else if (s1.length() - 1 == s2.length())
            return methodForRemove(s1, s2);
        else return false;

    }

    private static boolean methodForRemove(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        while (index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    private static boolean methodForReplacement(String s1, String s2) {
        boolean counditionForReplace = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s1.charAt(i)) {
                if (counditionForReplace) return false;

                counditionForReplace = true;
            }
        }
        return true;
    }
}
