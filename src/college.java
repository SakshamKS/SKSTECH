public class college {
    void getstudentdetail(String name, int rollnumber) {
        System.out.println("The name of student is " + name);
        System.out.println("Roll number of student is " + rollnumber);}

}
    class student extends college{
        void getexamdetail(String subject){
            System.out.println(subject );}
        }
        class exam extends student{
            college c1 = new college();
            student s1 = new student();
        }
        class sample{
            public static void main(String[] args) {


                exam e1 = new exam();
                e1.getstudentdetail("Suyash",301);
                e1.getexamdetail("Math");


    }
}

