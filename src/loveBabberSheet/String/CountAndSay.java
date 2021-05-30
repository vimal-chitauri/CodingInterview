package loveBabberSheet.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(3322251));
    }

    public static String countAndSay(int n) {
        char[] array = ("" + n).toCharArray();
        int count = 1;
        String finalString = "";
        // Arrays.sort(array);
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap();
        for (int i = 0; i < array.length; i++) {
            if (i + 1 < array.length && array[i] == array[i + 1]) {
                count++;
            } else {
                hm.put(Integer.parseInt(array[i] + ""), count);
                count = 1;
            }
        }
        for (Integer key : hm.keySet()) {
            finalString += (hm.get(key) + "" + key);
        }
        return finalString;
    }
}
