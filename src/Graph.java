import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    private int V;
    private LinkedList<Integer> adjacency[];
    private Queue<Integer> adjacencyy;
    public  void graphimplement(int n){
        V= n;
        adjacency = new LinkedList[n];
        for (int i = 0 ;i<n ;i++){
            adjacency[i] = new LinkedList<Integer>();

        }

        }
    public void graphinsert(int d, int g  )
    {
        adjacency[d].add(g);
    }



            }


public class Graph{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertex : ");
        int a= sc.nextInt();
        System.out.println("Enter the number of edge: ");
        int edge = sc.nextInt();

        Node graph = new Node();
        graph.graphimplement(8);
        graph.graphinsert(2 ,3);
    }
}
