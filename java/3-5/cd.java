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

        int N,M, ans,m,k;
        int[] array;
        String[] str;
        try {
            str = reader.readLine().split(" ");
            N = Integer.parseInt(str[0]);
            M = Integer.parseInt(str[1]);

            if (N==0&&M==0) System.out.println(0);
            while(!(N==0&&M==0)){
                array = new int[N];
                ans = 0;
                for(int i = 0; i < N; i++){
                    array[i] = Integer.parseInt(reader.readLine());
                }

                k = 0;
                if (N>0){
                    for (int i = 0;i<M;i++){
                        m = Integer.parseInt(reader.readLine());
                        while(array[k]<m){
                            k++;
                            if(k > N-1) break; //reach end of n
                        }
                        if(k > N-1){
                            k = i;
                            break;
                        }
                        if(array[k]==m){
                            k++;
                            ans++;
                        }
                    }
                }
                else k = -1;

                for(int i = k+1; i<M; i++){
                    reader.readLine();
                }
                writer.write(Integer.toString(ans)+'\n');
                str = reader.readLine().split(" ");
                N = Integer.parseInt(str[0]);
                M = Integer.parseInt(str[1]);
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
