import java.util.ArrayList;

public class RemoveEl{
    public static void main(String[] args) {
        ArrayList<Integer> Sample = new ArrayList<>();
        Sample.add(2);
        Sample.add(3);
        Sample.add(4);
        Sample.add(5);

        Sample.remove(1);
        System.out.println(Sample);
    }
}