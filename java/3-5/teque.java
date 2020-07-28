/*
https://open.kattis.com/problems/teque
Difficulty: 3.5
*/
import java.util.*;
import java.io.*;

public class Teque {

    int front = 0;
    int middle = 0;
    int back = 0;
    private void run(){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
        BufferedWriter writer = new BufferedWriter(outputStreamWriter);
        try {
            int N = Integer.parseInt(reader.readLine());
            String[] str;
            int num;
            for(int i = 0; i < N; i++){
                str = reader.readLine().split(" ");
                num = Integer.parseInt(str[1]);
                switch(str[0]){
                    case "push_back":
                        push_back(num);
                        break;
                    case "push_front":
                        push_front(num);
                        break;
                    case "push_middle":
                        push_middle(num);
                        break;
                    case "get":
                        writer.write(get(num));
                        break;
                    default:
                        throw new Exception("invalid method: " + str[0]);
                }
            }
            writer.flush();
            reader.close();
            writer.close();
        } catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
    private void push_back(int x){
        deque2.addLast(arrayList.size);
        arrayList.add(x);
    }
    private void push_front(int x){
        deque1.addLast(arrayList.size);
        arrayList.add(x);
    }
    private void push_middle(int x){

    }
    private int get(int index){
        return 1;
    }
    public static void main(String[] args) {
        Teque main = new Teque();
        main.run();
    }
}

public class Node {
    private int value;
    private int size;
    private Node left;
    private Node right;


    public Node(int value){
        this.value = value;
        size = 1;
    }
    public void incrementSize(){
        this.size++;
    }
    public void setLeft(Node left){
        this.left = left;
    }
    public void setRight(Node right){
        this.right = right;
    }
    public int getValue(){
        return this.value;
    }
    public Node getLeft(){
        return this.left;
    }
    public Node getRight(){
        return this.right;
    }
}
