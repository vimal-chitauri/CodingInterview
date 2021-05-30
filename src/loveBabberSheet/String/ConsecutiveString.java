package loveBabberSheet.String;

import java.util.ArrayList;

public class ConsecutiveString {
    public static void main(String[] args) {
        removeConsecutiveCharacter("aabbaa");
    }

    public static String removeConsecutiveCharacter(String S) {
        char[] arr = S.toCharArray();
        StringBuffer finalString = new StringBuffer();
        ArrayList<Character> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i + 1 <= arr.length && arr[i] == arr[i + 1]) {
                finalString.append(arr[i]);
            }
        }
        String removeConsecutiveChar = finalString.toString();
        return removeConsecutiveChar;
    }
}
