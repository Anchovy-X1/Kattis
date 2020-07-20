/*
https://open.kattis.com/problems/modulo
Difficulty: 1.3
*/
import java.util.*;
import java.io.*;

public class Modulo {

    private void run(){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int num = 0;
        Scanner s = new Scanner(System.in);
        int input;
        for (int i = 0;i<10 ;i++ ) {
            input = Integer.parseInt(s.nextLine())%42;
            if(!hashSet.contains(input)){
                num++;
                hashSet.add(input);
            }
        }
        System.out.println(num);
    }
    public static void main(String[] args) {
        Modulo main = new Modulo();
        main.run();
    }
}
