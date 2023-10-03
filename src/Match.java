import java.util.ArrayList;

public class Match {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();

        a1.add("Vishesh");
        a1.add("Luther");

                a2.add("Vishesh");
        a2.add("King");

        String h ;
        h = ((a1.equals((a2))))? "YES" : "NO";
        System.out.println(h);

    }
}
