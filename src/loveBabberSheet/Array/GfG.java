package loveBabberSheet.Array;

/*Complete the Function below*/
class GfG {
    public static int palinArray(int[] a, int n) {
        int isPalinArray = 1;
        for (int i = 0; i < n; i++) {
            if (isPalingdrome(a[i]) != a[i]) {
                isPalinArray = 0;
            }
        }
        return isPalinArray;
    }

    public static int isPalingdrome(int n) {
        int rev_no = 0;
        while (n > 0) {
            rev_no = rev_no * 10 + n % 10;
            n = n / 10;
        }
        return rev_no;
    }
}
