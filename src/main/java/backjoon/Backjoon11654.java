package backjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

public class Backjoon11654{
    private static BufferedReader br;
    private static BufferedWriter bw;
    public static void main(String[] args) throws IOException{
        
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br = new BufferedReader(new InputStreamReader(System.in));    
        
        char[] charactor = br.readLine().toCharArray();
        bw.write(Integer.toString((int)charactor[0]));

        bw.flush();
        bw.close();
        br.close();

    }
}