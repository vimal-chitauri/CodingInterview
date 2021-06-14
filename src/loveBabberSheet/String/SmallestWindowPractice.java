package loveBabberSheet.String;

public class SmallestWindowPractice {
    public static void main(String[] args) {
        String str="this is a test String";
        String ptr="tist";
        System.out.println(smallestWindow(str,ptr));
    }
    static final int character_count=256;
    private static String smallestWindow(String str, String ptr) {
        int lengthStr=str.length();
        int lengthPtr=ptr.length();
        int[] hashStr=new int[character_count];
        int[] hashPtr=new int[character_count];
        int count=0,startIndex=-1,start=0;
        int min_count=Integer.MAX_VALUE;

        for (int i = 0; i < lengthPtr; i++)
            hashPtr[ptr.charAt(i)]++;

        for (int i = 0; i < lengthStr; i++) {
            hashStr[str.charAt(i)]++;

            if(hashStr[str.charAt(i)]<=hashPtr[str.charAt(i)]){
                count++;
            }
            if(count==lengthPtr){
                while (hashStr[str.charAt(start)]>hashPtr[str.charAt(start)]){

                    if(hashStr[str.charAt(start)]>hashPtr[str.charAt(start)])
                        hashStr[str.charAt(start)]--;
                    start++;
                }
                int len_window=i-start+1;
                if(min_count>len_window){
                    min_count=len_window;
                    startIndex=len_window;
                }
            }
        }
        if(startIndex==-1){
            System.out.println("no Such window exist");
        }

        return str.substring(start,start+min_count);
    }
}
