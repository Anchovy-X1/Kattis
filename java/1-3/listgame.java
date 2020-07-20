/*
https://open.kattis.com/problems/listgame
Difficulty: 2.9
*/
import java.util.*;
import java.io.*;

public class ListGame {
    private void run(){
        Scanner s = new Scanner(System.in);
        int input = Integer.parseInt(s.nextLine());
        int ans = 0;
        int k = 2;
        while(k*k<=input){
            if(input%k==0){
                input/=k;
                ans++;
            } else {
                k++;
            }
        }
        System.out.println(ans+1);
    }
    public static void main(String[] args) {
        ListGame main = new ListGame();
        main.run();
    }
}
