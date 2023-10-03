import java.util.ArrayList;

public class ArrayL {
    public static void main(String[] args) {
        ArrayList<String> Sample = new ArrayList<>();
        Sample.add("Prince");
        Sample.add("Knight");
        Sample.add("Ragnar");
        Sample.add("Keshav");
        System.out.println("Student list with e : ");

        //for-each loop
        for (String s : Sample) {
            if (s.contains("e")) {
                System.out.println(s);
            }
        }
    }
}
