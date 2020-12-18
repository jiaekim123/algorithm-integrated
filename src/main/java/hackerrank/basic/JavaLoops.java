package hackerrank.basic;

import java.util.Scanner;

public class JavaLoops {
    public static void main(String []argh){
		System.out.println("입력");
    	Scanner in = new Scanner(System.in);
    	// 몇 줄 읽을 것인가
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			// 입력 값을 받는다.
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			
			// 한 줄씩 결과를 출력한다.
			for (int j = 0; j < n ; j++) {
				int s = a;
				// 계산한 숫자를 구한다.
				for (int m = 0; m <= j; m++) {
					s += (int)Math.pow(2, m)*b;
				}
				System.out.print(s);
				
				if(j != n-1) {
					System.out.print(" ");					
				}
			}
			System.out.println();
		}
		
        in.close();
    }
}
