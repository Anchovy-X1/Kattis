/*
https://open.kattis.com/problems/cd
Difficulty: 5.1
*/
import java.util.*;
import java.io.*;

public class CD {
    private void run(){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
        BufferedWriter writer = new BufferedWriter(outputStreamWriter);
        try {
            ArrayList<Integer> arrayList = new ArrayList<>;
            String[] str = reader.readLine().split(" ");
            int N = Integer.parseInt(str[0]);
            int M = Integer.parseInt(str[1]);
            for(int i = 0; i < N; i++){
                arrayList.add(Integer.parseInt(reader.readLine()));
            }
            int k = 0;
            for(int i = 0; i < M; i++){

            }
            writer.flush();
            reader.close();
            writer.close();
        } catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
    public static void main(String[] args) {
        CD main = new CD();
        main.run();
    }
}
