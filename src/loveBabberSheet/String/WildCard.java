package loveBabberSheet.String;

public class WildCard {
    // Java program to match wild card characters

    // The main function that checks if
// two given strings match. The first string
// may contain wildcard characters
    static boolean match(String first, String second) {

        // If we reach at the end of both strings,
        // we are done
        if (first.length() == 0 && second.length() == 0)
            return true;

        // Make sure that the characters after '*'
        // are present in second string.
        // This function assumes that the first
        // string will not contain two consecutive '*'
        if (first.length() > 1 && first.charAt(0) == '*' &&
                second.length() == 0)
            return false;

        // If the first string contains '?',
        // or current characters of both strings match
        if ((first.length() > 1 && first.charAt(0) == '?') ||
                (first.length() != 0 && second.length() != 0 &&
                        first.charAt(0) == second.charAt(0)))
            return match(first.substring(1),
                    second.substring(1));

        // If there is *, then there are two possibilities
        // a) We consider current character of second string
        // b) We ignore current character of second string.
        if (first.length() > 0 && first.charAt(0) == '*')
            return match(first.substring(1), second) || match(first, second.substring(1));
        return false;
    }


    static boolean testMatch(String wild, String pattern){

        if(wild.length()==0 && pattern.length()==0)
            return true;

        if(wild.length()>1 && wild.charAt(0)=='*' && pattern.length()==0)
            return false;

        if ((wild.length() > 1 && wild.charAt(0) == '?') ||
                (wild.length() != 0 && pattern.length() != 0 &&
                        wild.charAt(0) == pattern.charAt(0)))
            return testMatch(wild.substring(1),
                    pattern.substring(1));

        if(wild.length()>1 && wild.charAt(0)=='*')
            return testMatch(wild.substring(1),pattern)||testMatch(wild,pattern.substring(1));
        return false;
    }
    // A function to run test cases
    static void test(String first, String second) {
        if (testMatch(first, second))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    // Driver Code
    public static void main(String[] args) {
        test("g*ks", "geeks"); // Yes
        test("ge?ks*", "geeksforgeeks"); // Yes
        test("g*k", "gee"); // No because 'k' is not in second
        test("*pqrs", "pqrst"); // No because 't' is not in first
        test("abc*bcd", "abcdhghgbcd"); // Yes
        test("abc*c?d", "abcd"); // No because second must have 2
        // instances of 'c'
        test("*c*d", "abcd"); // Yes
        test("*?c*d", "abcd"); // Yes
    }

}
