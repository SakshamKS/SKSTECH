import java.util.Scanner;

class Stack{
    int top = -1;
    int a;
    int arr[] = new int[6];

    void push() {
        Scanner sc = new Scanner(System.in);

        if (top == (arr.length - 1)) {
            System.out.println("Overflow");
        } else {
            System.out.println("Enter data: ");
            for (int i = 0;i< arr.length;i++) {
                arr[i] = sc.nextInt();
            }
            top = top + 1;
        }
    }

    void display(){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}



public class STK {

         public static void main(String[] args) {
             Stack b = new Stack();
             b.push();
             b.display();
         }
}


