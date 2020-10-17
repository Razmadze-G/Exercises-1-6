public class Parentheses {
    public static boolean isValid (String s) {
        StringBuilder str = new StringBuilder(s);
        int i = 0;
        while (str.length() > 0 && i <= str.length() - 2)
        {
            if (str.charAt(i) == '(' && str.charAt(i + 1) == ')')
            {
                str.replace(i, i + 2, "");
                i = 0;
            }
            else ++i;
        }
        return str.length() == 0;
    }
}

