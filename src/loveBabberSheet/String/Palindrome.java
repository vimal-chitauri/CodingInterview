package loveBabberSheet.String;

public class Palindrome {
    public static void main(String[] args) {
        String s = "ABBA";
        System.out.println(methodForPalindrome(s));
    }

    private static int methodForPalindrome(String s) {
        int condition = 0;
        char[] array = s.toCharArray();
        char[] reversArray = new char[s.length()];

        for (int i = s.length() - 1; i >= 0; i--) {
            reversArray[s.length() - 1 - i] = array[i];
        }

        for (int i = 0; i < s.length(); i++) {
            if (reversArray[i] != array[i]) {
                condition = 0;
                break;
            }
            condition = 1;
        }
        return condition;
    }

}
