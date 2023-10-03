public class Stringdemo
{
    public static void main(String[] args)
    {
        String s1 = "java";
        String s2 = "j2ee";
        String s3 = s1;
        String s4 = "java";
        System.out.println(s1==s2);
        System.out.println(s1==s4);
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s2));
        String s5= new String("xyz");
        char arr[] = { 'a' , 'b' ,'c' };
        String s6 = new String( arr);
        System.out.println(s6);
        System.out.println(s5);
        char arr2[] = { 'a' , 'b' , 'c' , 'd' , 'e' , 'f' };
        String s7 = new String(arr2,2,3);
        System.out.println(s7);
        
    }
}
