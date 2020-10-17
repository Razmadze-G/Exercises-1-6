public class Palindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        StringBuilder str = new StringBuilder(s);
        str = str.reverse();
        String s1 = str.toString();
        if (s.equals(s1)) {
            return true;
        }
        return false;
    }
}
