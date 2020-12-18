/** 
 * 번호: Backjoon 11729번
 * 제목: 하노이의 탑
 * 유형: 재귀함수 (분할정복)
 * 비고: BufferedWriter, BufferedReader 클래스 사용
 **/

package backjoon;

import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.lang.Math;

public class Backjoon11729 {
    private final static int TOTAL_PILLAR = 6;
    private static BufferedReader br;
    private static BufferedWriter bw;
    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            int number = Integer.parseInt(br.readLine());
            bw.write(Integer.toString((int)Math.pow(2, number)-1)+"\n");
            hanoi(number, 1, 3);

            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }   
    }

    public static void hanoi(int number, int start, int end) {
        int stay;
        try{
            if(number==1){
                bw.write(start+" "+end+"\n");
            } else {
                stay = TOTAL_PILLAR-start-end;
                hanoi(number-1, start, stay);
                bw.write(start+" "+end+"\n");
                hanoi(number-1, stay, end);    
            }    
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}