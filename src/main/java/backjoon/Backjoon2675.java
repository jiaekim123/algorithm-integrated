package backjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

public class Backjoon2675{
    private static BufferedReader br;
    private static BufferedWriter bw;
    public static void main(String[] args) throws IOException{
        
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br = new BufferedReader(new InputStreamReader(System.in));    

        int testCase = Integer.parseInt(br.readLine());
        for(int i = 0 ; i <testCase; i++){
           String inputString = br.readLine();
            if(inputString.contains(" ")){
                int R = Integer.parseInt(inputString.split(" ")[0]);
                char[] S = inputString.split(" ")[1].toCharArray();
                for(int k = 0; k<S.length; k++){
                    for(int j = 0; j<R; j++){
                        bw.write(S[k]);
                    }
                }
                bw.write("\n");
            }           
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}