public class Throwsdemo {
    static void m1()throws IllegalAccessException
    {
        System.out.println("Inside m1");
        throw new IllegalAccessException("demo");
       // System.out.println("Not executed");
        }
    public static void main(String[]args)
    {
        try{
            m1();
            System.out.println("Not executed");
        }
        catch (IllegalAccessException e1)
        {
            System.out.println("Caught :" +e1);
        }
    }
}
