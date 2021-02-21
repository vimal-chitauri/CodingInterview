import java.util.Scanner;

public class CodingInterview9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        System.out.println(methodRotation(s1,s2));
    }

    public static Boolean methodRotation(String s1, String s2) {

        if (s1.length() == s2.length() || s1.length() > 0) {
            String substring = s1 + s1;
            return substring.contains(s2);
        }
        return false;
    }
}
