public class LengthofLastword
{
    public static void main(String[] args)
    {
        String s ="Sudarshan is a casanova guy";
        String[] st = s.split(" ");
        if (s == null || s.length() == 0) {

            }

        if (st.length == 0)
            System.out.println("length of last word");

        System.out.println(st[st.length - 1].length());

    }
}
