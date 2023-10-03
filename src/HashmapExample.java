import java.sql.SQLOutput;
import java.util.HashMap;

public class HashmapExample {
    public static void main(String[] args){
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Suyash" , 20);
        map.put("Vishesh" , 25);
        map.put("Nitesh" , 10);
        map.put("keshav" , 15);
        System.out.println("Size of map :"+map.size());
        System.out.println(map);
        String searchKey="Vishesh";
        if (map.containsKey(searchKey))
        {
            Integer a =map.get("Vishesh");
            System.out.println("value for the key "+ "Vishesh is :" + a);
        }
    }
}
