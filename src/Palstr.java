import java.util.Locale;

public class Palstr {
    public static boolean isPalindrome(String str) {

        String rv = "";


        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rv = rv + str.charAt(i);
        }


        if (str.equals(rv)) {
            ans = true;
        }
        return ans;
    }

    public static void main(String[] args) {

        String st = "Madam";

        st = st.toLowerCase();
        boolean b = isPalindrome(st);
        System.out.println(b);
    }
}

