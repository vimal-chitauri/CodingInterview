package loveBabberSheet.String;

public class ReverseArray {
    public static void main(String[] args) {
        char[] arrayChar = {'h', 'e', 'l', 'l', 'o'};
        reverseString(arrayChar);
    }

    public static void reverseString(char[] s) {
        char[] temp = new char[s.length];
        for (int i = temp.length - 1; i >= 0; i--) {
            // System.out.println(s[i]);
            temp[temp.length - 1 - i] = s[i];
        }
        for (int i = 0; i < temp.length; i++) {
            s[i]=temp[i];
        }
    }
}
