import java.util.Scanner;

public class CodingInterview9part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        System.out.println(methodRotation(s1, s2));
    }

    private static boolean methodRotation(String s1, String s2) {
        int[] arrayContainsForS1 = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        int[] arrayContainsForS2 = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char ch : s1.toCharArray()) {
            int x = getCharNumber(ch);
            if (x != -1) {
                arrayContainsForS1[x]++;
            }
        }
        for (char ch : s2.toCharArray()) {
            int x = getCharNumber(ch);
            if (x != -1) {
                arrayContainsForS2[x]++;
            }
        }
        return methodForCheckingArrayCount(arrayContainsForS1, arrayContainsForS2);


    }

    private static boolean methodForCheckingArrayCount(int[] arrayContainsForS1, int[] arrayContainsForS2) {
        boolean isSubsting = false;
        for (int a = 0; a < 26; a++) {
            if (arrayContainsForS1[a] == arrayContainsForS2[a]) {
                isSubsting = true;
            } else {
                isSubsting = false;
                break;
            }
        }
        return isSubsting;
    }

    private static int getCharNumber(char ch) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int value = Character.getNumericValue(ch);
        if (value >= a && value <= z) {
            return value - a;
        }
        return -1;
    }

}
