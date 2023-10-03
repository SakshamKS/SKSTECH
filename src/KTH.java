import java.util.ArrayList;
import java.util.*;

public class KTH {
    public static void main(String[] args) {
        int h;
        Scanner in = new Scanner(System.in);
        h = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(8);
        arr.add(7);
        arr.add(3);
        arr.add(1);

        Collections.sort(arr);
        System.out.println("The 3rd largest : ");
        System.out.println(arr.get(arr.size() - h ));

    }
}
