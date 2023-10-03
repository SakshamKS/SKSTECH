import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String args[])
    {
        Map<String,Integer> student = new HashMap<String, Integer>();
        student.put("Vishesh", new Integer(10));
        student.put("Martin", new Integer(20));
        student.put("Luther", new Integer(30));
        student.put("King", new Integer(40));

        for (Map.Entry<String,Integer> a: student.entrySet())
        {
            System.out.println(a.getKey()+":");
            System.out.println(a.getValue());
        }
        System.out.println(student);
    }
}