/*
https://open.kattis.com/problems/twostones
Difficulty: 1.2
*/
import java.util.*;
import java.io.*;

public class TwoStones {
    private void run(){
        Scanner s = new Scanner(System.in);
        int num = Integer.parseInt(s.nextLine());
        if (num%2==1) System.out.println("Alice");
        else System.out.println("Bob");
    }
    public static void main(String[] args) {
        TwoStones main = new TwoStones();
        main.run();
    }
}
