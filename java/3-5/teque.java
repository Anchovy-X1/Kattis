/*
https://open.kattis.com/problems/teque
Difficulty: 3.5
*/


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
